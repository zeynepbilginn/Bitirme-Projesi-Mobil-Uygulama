import json
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"

conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

with open('kaggle_dataset.json', 'r') as file:
    json_data = json.load(file)

for ingredient_id, ingredient_data in json_data['Ingredient'].items():
    turkish_name = ingredient_data['Turkish Name']
    sodium = int(ingredient_data['Sodium'])
    potassium = int(ingredient_data['Potassium'])
    
    cur.execute("SELECT id FROM food WHERE name = %s", (turkish_name,))
    food_id = cur.fetchone()
    
    if food_id is not None:
        food_id = food_id['id']
        
        cur.execute("DELETE FROM food_minerals WHERE food_id = %s AND mineral_id = %s", (food_id, 1))
        cur.execute("DELETE FROM food_minerals WHERE food_id = %s AND mineral_id = %s", (food_id, 2))
        
        cur.execute("INSERT INTO food_minerals (food_id, mineral_id, amount) VALUES (%s, %s, %s)", (food_id, 1, sodium))
        cur.execute("INSERT INTO food_minerals (food_id, mineral_id, amount) VALUES (%s, %s, %s)", (food_id, 2, potassium))
    
conn.commit()

cur.close()
conn.close()
