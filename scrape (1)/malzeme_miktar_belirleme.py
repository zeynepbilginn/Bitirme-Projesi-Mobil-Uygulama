import json

# Kelime listesi
measurement_words = ["gram", "dis", "yemek kasigi", "cay kasigi", "tatli kasigi", "su bardagi", "adet", "paket", "ml.","demet"
                     ,"dal","kepce","cay bardagi","parca","kase","dilim","tutam" ,"kahve fincani",
                     "litre","avuc","corba kasigi","sise","yaprak","kg.","kavanoz","cimdik",
                     "kutu","bag","bardak","damla","sap","kup","cl.","dilediginiz kadar","poset","fincan",
                     "bas"]

with open('processed_ingredients_list.json', 'r', encoding='utf-8') as file:
    data = json.load(file)

processed_data = []
key_counter = 1

for item in data:
    key = list(item.keys())[0] 
    ingredients = item[key]

    processed_ingredients = []

    for ingredient in ingredients:
        ingredient_name = ingredient['ingredient']
        amount = ingredient['amount']
        size = ""

        for word in measurement_words:
            if word in ingredient_name:
                parts = ingredient_name.split(word, 1)
                ingredient_name = parts[1].strip()
                size = word
                break

        processed_ingredients.append({'size': size, 'ingredient': ingredient_name, 'amount': amount})

    processed_data.append({str(key_counter): processed_ingredients})
    key_counter += 1

with open('separated_ingredients_list.json', 'w', encoding='utf-8') as file:
    json.dump(processed_data, file, ensure_ascii=False, indent=4)
