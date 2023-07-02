import json
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"

conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

existing_meals_type = [] 

cur.execute("SELECT name FROM meal_types")
rows = cur.fetchall()
for row in rows:
    existing_meals_type.append(row['name'])

with open("meals.json", encoding='utf-8') as f:
    datas = json.load(f)

cur.execute("SELECT MAX(id) FROM meal_types")  # Mevcut en yüksek id değerini al
max_id = cur.fetchone()[0]
next_id = max_id + 1 if max_id else 1  # Bir sonraki id değerini hesapla

for meal_id, meal_data in datas.items():
    meal_type_name = meal_data["MainCategory"]
    if meal_type_name not in existing_meals_type:  # Aynı isimde bir kayıt yoksa ekle
        insert = f"""INSERT INTO meal_types(id, name) VALUES ({next_id}, '{meal_type_name}')"""
        cur.execute(insert)
        existing_meals_type.append(meal_type_name)
        next_id += 1 

conn.commit()
conn.close()
