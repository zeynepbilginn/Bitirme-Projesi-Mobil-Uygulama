import json

with open('separated_ingredients_list.json', 'r') as f:
    separated_ingredients = json.load(f)


with open('food_in_the_meal.json', 'r') as f:
    food_in_the_meal = json.load(f)


result = {}

for meal_data in separated_ingredients:
    for meal_id, ingredients in meal_data.items():
        
        meal_ingredients = [ingredient['ingredient'] for ingredient in ingredients]

        food_ids = []
        for food_id, food_ingredients in food_in_the_meal.items():
            if set(meal_ingredients) == set(food_ingredients.keys()):
                food_ids.append(food_id)

    
        result[meal_id] = {
            'food_ids': food_ids,
            'ingredients': {
                ingredient['ingredient']: {
                    'food_id': food_in_the_meal[food_id][ingredient['ingredient']],
                    'amount': ingredient['amount'],
                    'size': ingredient['size']
                }
                for food_id in food_ids
                for ingredient in ingredients
            }
        }

with open('meal_ingredients.json', 'w') as f:
    json.dump(result, f, indent=4)
