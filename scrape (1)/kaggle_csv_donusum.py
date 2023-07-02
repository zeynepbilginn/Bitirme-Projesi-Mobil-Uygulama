import csv
import json


with open("kaggle_dataset.json", "r") as json_file:
    data = json.load(json_file)

new_headers = ["Food", "Measure", "Grams", "Calories", "Protein", "Fat", "SatFat", "Fiber", "Carbs", "Category"]

csv_data = []
for ingredient_id, ingredient_data in data["Ingredient"].items():
    food = ingredient_data.get("Turkish Name", "").capitalize()
    measure = "x"
    grams = "100.0"
    calories = ingredient_data.get("Calorie", "")
    protein = ingredient_data.get("Protein", "")
    fat = ingredient_data.get("Fat", "")
    sat_fat = ingredient_data.get("Saturated Fat", "")
    fiber = ingredient_data.get("Fiber", "")
    carbs = ingredient_data.get("Carbohydrates", "")
    category = "x"

    new_row = [food, measure, grams, calories, protein, fat, sat_fat, fiber, carbs, category]
    csv_data.append(new_row)


with open("düzenlenmiş_veriler.csv", "w", newline="", encoding="utf-8") as csv_file:
    writer = csv.writer(csv_file)
    writer.writerow(new_headers)
    writer.writerows(csv_data)

print("Düzenlenmiş CSV dosyası oluşturuldu: düzenlenmiş_veriler.csv")
