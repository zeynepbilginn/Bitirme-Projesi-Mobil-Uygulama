# import csv
# import json

# # JSON dosyasını okuyun
# with open('food_in_meal_id.json',encoding='utf-8') as json_file:
#     data = json.load(json_file)

# # CSV dosyasını okuyun
# csv_data = []
# with open('turkce_foods.csv', 'r',encoding='utf-8') as csv_file:
#     csv_reader = csv.DictReader(csv_file)
#     for row in csv_reader:
#         csv_data.append(row)

# # Yeni verileri depolamak için bir sözlük oluşturun
# new_data = {}

# # JSON verilerini döngüye alın
# for key, values in data.items():
#     new_values = {}
#     # JSON verilerini döngüye alın
#     for value in values:
#         # CSV dosyasındaki ilgili veriyi bulun
#         for csv_row in csv_data:
#             if csv_row['Food'].lower() == value.lower():
#                 new_values[value] = int(csv_row['Id'])
#                 break
#     new_data[key] = new_values

# # Yeni verileri JSON dosyasına yazın
# with open('output_new.json', 'w',encoding='utf-8') as json_file:
#     json.dump(new_data, json_file,ensure_ascii=False, indent=4)

import csv
import json


with open('food_in_meal_id.json', encoding='utf-8') as json_file:
    data = json.load(json_file)

csv_data = []
with open('turkce_foods_updated.csv', 'r', encoding='utf-8') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    for row in csv_reader:
        csv_data.append(row)

new_data = {}

for key, values in data.items():
    new_values = {}

    for value in values:
    
        found_match = False
        for csv_row in csv_data:
            if csv_row['Food'].lower() == value.lower():
                new_values[value] = int(csv_row['Id'])
                found_match = True
                break
        if not found_match:
            new_values[value] = 905
    new_data[key] = new_values

with open('food_in_the_meal.json', 'w', encoding='utf-8') as json_file:
    json.dump(new_data, json_file, ensure_ascii=False, indent=4)
