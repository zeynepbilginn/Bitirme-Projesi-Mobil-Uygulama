import json
import psycopg2
import psycopg2.extras

DB_HOST = "localhost"
DB_NAME = "turkishmeals"
DB_USER = "postgres"
DB_PASS = "3544241"

conn = psycopg2.connect(dbname=DB_NAME, user=DB_USER, password=DB_PASS, host=DB_HOST, port=5432)
cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)

with open('separated_ingredients_list.json') as file:
    data = json.load(file)

for entry in data:
    for key, values in entry.items():
        meal_id = int(key)
        for idx, item in enumerate(values):
            size = item["size"]
            amount = float(item["amount"].replace(",", "."))  # Özel karakterleri düzeltmek için
            cur.execute("""
                UPDATE food_in_the_meal
                SET quantity = %s, unit = %s
                WHERE meal_id = %s;
            """, (amount, size, meal_id))

conn.commit()

conn.close()
