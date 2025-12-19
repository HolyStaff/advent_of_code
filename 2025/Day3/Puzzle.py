def checkLargestNumber(battery_bank):
    largest_number = 0
    second_largest_number = 0
    for index in range(len(battery_bank)):
        current_number = int(battery_bank[index])
        
        if current_number > largest_number and index != len(battery_bank)-1:
            largest_number = current_number
            second_largest_number = 0
        elif current_number > second_largest_number:
            second_largest_number = current_number
    print(str(largest_number) + str(second_largest_number))
    return str(largest_number) + str(second_largest_number)


def main():
    total = 0
    with open("input.txt", "r") as myFile:
        for line in myFile:
            data = line.rstrip("\n")
            test = checkLargestNumber(data)
            total += int(test)
    print(total)

if __name__ == "__main__":
    main()
