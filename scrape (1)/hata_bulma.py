import csv

def find_string_prices(csv_file):
    with open(csv_file, 'r') as file:
        reader = csv.DictReader(file)
        for row in reader:
            price = row['Price']
            if isinstance(price, str):
                print(f"String price found: {row}")

csv_file_path = 'turkce_updated3.csv'

find_string_prices(csv_file_path)
