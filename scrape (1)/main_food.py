import csv
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"

conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

existing_foods = [] 
cur.execute("SELECT name FROM food")
rows = cur.fetchall()
for row in rows:
    existing_foods.append(row['name'])

with open("turkce_foods_updated3.csv") as f:
    datas = csv.DictReader(f)
    for data in datas:
        food_id = data['Id']
        food_name = data["Food"]
        if food_name not in existing_foods:  # Aynı isımde bir kayıt yoksa ekle
            insert = f"""INSERT INTO food(id, name, fat, carbohydrates, protein, food_quantity, food_unit, price, image_url)
                        VALUES ({food_id}, '{food_name}', {data["Fat"]}, {data["Carbs"]}, {data["Protein"]}, {data["Grams"]}, 'gr',
                                '{data["Price"]}', '{data["Img_url"]}')"""
            cur.execute(insert)
            existing_foods.append(food_name)

conn.commit()
conn.close()
