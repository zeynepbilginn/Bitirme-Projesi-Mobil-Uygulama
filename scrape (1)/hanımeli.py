import csv

new_headers = ["Food", "Measure", "Grams", "Calories", "Protein", "Fat", "SatFat", "Fiber", "Carbs", "Category"]

data = []
with open("veriler.csv", "r", encoding="utf-8") as csv_file:
    reader = csv.reader(csv_file)
    next(reader)  # İlk satırı atla (eski başşlıkları)
    
    for row in reader:
        food = row[1]
        measure = "100 gr"  # Ölçüm birimi olarak "100 gr" kullandım
        grams = 100
        calories = row[2]
        protein = row[3]
        fat = row[4]
        sat_fat = ""
        fiber = ""
        carbs = row[5]
        category = "X"

        new_row = [food, measure, grams, calories, protein, fat, sat_fat, fiber, carbs, category]
        data.append(new_row)

with open("düzenlenmiş_veriler.csv", "w", newline="", encoding="utf-8") as csv_file:
    writer = csv.writer(csv_file)
    writer.writerow(new_headers)
    writer.writerows(data)

print("Düzenlenmiş CSV dosyası oluşturuldu: düzenlenmiş_veriler.csv")