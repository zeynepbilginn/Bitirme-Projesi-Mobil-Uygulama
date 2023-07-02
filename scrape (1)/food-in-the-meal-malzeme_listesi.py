import json

input_file = 'meals_int.json' 
output_file = 'ingredients_list.json' 

with open(input_file, 'r', encoding='utf-8') as f:
    meals = json.load(f)

ingredients_dict = {}


for meal_id, meal_data in meals.items():
    ingredients = meal_data['Ingridients'].split('\n') # Malzemeleri yemek ID'leri ile eşleştir
    ingredients_list = [ingredient.strip() for ingredient in ingredients if ingredient.strip() != '']
    ingredients_dict[meal_id] = ingredients_list

with open(output_file, 'w', encoding='utf-8') as f:
    json.dump(ingredients_dict, f, ensure_ascii=False, indent=4)

print("Malzeme listesi başarıyla oluşturuldu.")
