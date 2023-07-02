import json

turkce_foods = {}

with open("turkce_foods.json", encoding='utf-8') as file:
    turkce_foods = json.load(file)

with open("meals_int.json", encoding='utf-8') as file:
    data = json.load(file)

for key, value in data.items():
    ingredients = value['Ingridients'].split("●")[1:]
    ingredients_with_ids = {}
    for ingredient in ingredients:
        ingredient_id = turkce_foods.get(ingredient.strip())
        if ingredient_id is not None:
            ingredients_with_ids[ingredient.strip()] = ingredient_id
        else:
            ingredients_with_ids[ingredient.strip()] = None
    data[key]['Ingridients'] = ingredients_with_ids

with open("output.json", "w", encoding='utf-8') as file:
    json.dump(data, file, ensure_ascii=False, indent=4)
