import csv

def clean_CSV(csv_file):
    my_List = []
    # Reading from a CSV file
    with open(csv_file, 'r', encoding='utf-8') as file:
        csv_reader = csv.reader(file)
        for row in csv_reader:
            if row[1] == "" or row[1] == "-":
                continue
            # print(row, end=", ")
            # print(len(row))
            empty_row = []
            for col in row:
                empty_row.append(col.title())
            my_List.append(empty_row)

    # Writing to a CSV file
    with open('output.csv', 'w', newline='', encoding='utf-8') as file:
        csv_writer = csv.writer(file)
        for row in my_List:
            csv_writer.writerow(row)

clean_CSV("Country_Animals.csv")