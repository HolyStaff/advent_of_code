package Day3;

import java.io.File;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) throws Exception {
        File myFile = new File("test.txt");

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                checkLargestNumber(data);
            }
        }
    }

    public static int checkLargestNumber(String battery_bank){
        int largest_number = 0;
        for (char index : battery_bank.toCharArray()) {
            System.out.println(index);
        }
        return largest_number;
    }
}
