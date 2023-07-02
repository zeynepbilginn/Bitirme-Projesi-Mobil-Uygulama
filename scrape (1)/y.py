import json
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"

conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

cur.execute("TRUNCATE TABLE food_in_the_meal RESTART IDENTITY")

for meal_id, food_ids in data.items():
    for food_name, food_id in food_ids.items():
        cur.execute("INSERT INTO food_in_the_meal (meal_id, food_id) VALUES (%s, %s)", (meal_id, food_id))

conn.commit()

cur.close()
conn.close()
