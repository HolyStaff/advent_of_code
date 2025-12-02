package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle2 {
    public static int password;

    public static void main(String[] args) {
        File myFile = new File("example_input.txt");
        int last_number = 50;

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String[] parsedData = splitByNonDigitAndDigit(data);
                String movementDirection = parsedData[0];
                int inputValue = Integer.valueOf(parsedData[1]);

                int count = calculateNewPosition(movementDirection, inputValue, last_number);
                last_number = count;
                if (count == 0) {
                    password = increasePassword();
                }
            }
            displayPassword();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int increasePassword(){
        password += 1;
        return password;
    }

    public static void displayPassword(){
        System.out.println("Password is:");
        System.out.println(password);
    }

    public static String[] splitByNonDigitAndDigit(String data) {
        return data.split("(?<=\\D)(?=\\d)");
    }

    public static int calculateNewPosition(String direction, int amount, int last_number){
        if (direction.equals("L")){
            last_number -= amount;
            while (last_number < 0){
                last_number += 100;
                increasePassword();
            }
            return last_number;
        }
        if (direction.equals("R")){
            last_number += amount;
            while (last_number > 99){
                last_number -= 100;
                increasePassword();
            }
            return last_number;
        }
        throw new NullPointerException("invalid direction");
    }
}
