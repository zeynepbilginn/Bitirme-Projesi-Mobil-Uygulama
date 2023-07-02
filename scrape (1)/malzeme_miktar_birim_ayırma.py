import json

with open('ingredients_list.json', 'r', encoding='utf-8') as file:
    data = json.load(file)

processed_data = []

for key, ingredients in data.items():
    processed_ingredients = []

    for ingredient in ingredients:
        parts = ingredient.split(' ', 1)  # İlk boşluğa göre split yapar

        if len(parts) == 2:
            amount = parts[0]
            ingredient_name = parts[1]
        else:
            amount = ''
            ingredient_name = parts[0]

        processed_ingredients.append({'amount': amount, 'ingredient': ingredient_name})

    processed_data.append({key: processed_ingredients})

with open('processed_ingredients_list.json', 'w',encoding='utf-8') as file:
    json.dump(processed_data, file, ensure_ascii=False, indent=4)
