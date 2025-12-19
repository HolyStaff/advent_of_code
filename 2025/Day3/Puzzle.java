package Day3;

import java.io.File;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) throws Exception {
        File myFile = new File("input.txt");

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int test = checkLargestNumber(data);
                System.out.println(test);
            }
        }
    }

    public static int checkLargestNumber(String battery_bank){
        int largest_number = 0;
        int second_largest_number = 0;
        for (char index : battery_bank.toCharArray()) {
            int current_number = Character.getNumericValue(index);
            if (current_number > largest_number){
                largest_number = current_number;
            }
        }
        return largest_number;
    }
}
