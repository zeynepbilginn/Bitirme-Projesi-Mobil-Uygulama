import csv
import requests
from bs4 import BeautifulSoup
from io import StringIO

url = "https://www.hanimeliyemek.com.tr/kalori-cetveli.html"
response = requests.get(url)
html_content = response.text


soup = BeautifulSoup(html_content, "html.parser")

table = soup.find("table")
rows = table.find_all("tr")

buffer = StringIO()
writer = csv.writer(buffer)

for row in rows:
    cells = row.find_all("td")
    row_data = [cell.text.strip() for cell in cells]
    if row_data:
        if row_data[0].startswith(","):
            row_data[0] = row_data[0][1:]
        writer.writerow(row_data)

with open("veriler.csv", "w", newline="", encoding="utf-8") as csv_file:
    csv_file.write(buffer.getvalue())

print("CSV dosyası oluşturuldu: veriler.csv")
