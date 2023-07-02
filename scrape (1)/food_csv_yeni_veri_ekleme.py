import json
import csv

with open('turkce_foods_updated2.csv', 'r', encoding='utf-8') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    food_data = {row['Food']: row for row in csv_reader}

with open('kaggle_dataset.json', 'r', encoding='utf-8') as json_file:
    data = json.load(json_file)
    ingredients = data['Ingredient']
    for ingredient_id in ingredients:
        ingredient = ingredients[ingredient_id]
        turkish_name = ingredient['Turkish Name']
        if turkish_name in food_data:

            food_data[turkish_name]['Calories'] = float(ingredient['Calorie'])
            food_data[turkish_name]['Protein'] = float(ingredient['Protein'])
            food_data[turkish_name]['Fat'] = float(ingredient['Fat'])
            food_data[turkish_name]['SatFat'] = float(ingredient['Saturated Fat'])
            food_data[turkish_name]['Fiber'] = float(ingredient['Fiber'])
            food_data[turkish_name]['Grams'] = float(ingredient['Serving Size'])

with open('turkce_foods_updated2.csv', 'w', encoding='utf-8', newline='') as csv_file:
    fieldnames = ['Food', 'Measure', 'Grams', 'Calories', 'Protein', 'Fat', 'SatFat', 'Fiber', 'Carbs', 'Category', 'Id']
    writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
    writer.writeheader()
    for row in food_data.values():
        writer.writerow(row)

print("Veriler başarıyla güncellendi.")
