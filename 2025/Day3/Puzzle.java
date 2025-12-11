package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        File myFile = new File("input.txt");

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.print("bank: ");
                System.out.println(data);
                int check = checkLargestNumber(data);
                System.out.println(check);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int checkLargestNumber(String battery_bank){
        int largest_number = 0;
        for (char index : battery_bank.toCharArray()) {
            System.out.println(index);
            if (index > largest_number){
                largest_number = index;
                System.out.println(largest_number);
            }
        }
        return largest_number;
    }
}
