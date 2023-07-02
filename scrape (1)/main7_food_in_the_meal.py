import json
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"


conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

with open('meal_ingredients.json', 'r') as file:
    data = json.load(file)


start_id = 1 
for meal_id, meal_data in data.items():
    meal_ids = meal_data['meal_id']
    ingredients = meal_data['ingredients']

    for meal_index, meal_id in enumerate(meal_ids, start=1):
        for index, (ingredient_name, ingredient) in enumerate(ingredients.items(), start=1):
            food_id = ingredient['food_id']
            amount = ingredient['amount']
            size = ingredient['size']

            query = """
                INSERT INTO food_in_the_meal (id, meal_id, food_id, quantity, unit)
                VALUES (%s, %s, %s, %s, %s)
            """

           
            cur.execute(query, (start_id, meal_id, food_id, amount, size)) 
            start_id += 1  

conn.commit()
cur.close()
conn.close()
