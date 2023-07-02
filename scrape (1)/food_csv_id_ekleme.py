import csv

csv_data = []
with open('turkce_foods_cleaned.csv', 'r', encoding='utf-8') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    for index, row in enumerate(csv_reader, start=1):
        food = row['Food'].strip().lower()
   
        row.pop('Id', None)
        row['Food'] = food
        csv_data.append(row)

new_data = {}

for row in csv_data:
    food = row['Food']
    if food not in new_data:
        new_data[food] = {
            'Food': food,
            'Measure': row['Measure'],
            'Grams': row['Grams'],
            'Calories': row['Calories'],
            'Protein': row['Protein'],
            'Fat': row['Fat'],
            'SatFat': row['SatFat'],
            'Fiber': row['Fiber'],
            'Carbs': row['Carbs'],
            'Category': row['Category'],
            'Id': len(new_data) + 1
        }

fieldnames = ['Food', 'Measure', 'Grams', 'Calories', 'Protein', 'Fat', 'SatFat', 'Fiber', 'Carbs', 'Category', 'Id']
with open('turkce_foods_updated.csv', 'w', encoding='utf-8', newline='') as csv_file:
    writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
    writer.writeheader()
    writer.writerows(new_data.values())
