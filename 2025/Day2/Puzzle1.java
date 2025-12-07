package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle1 {
    public static void main(String[] args) {
        File myFile = new File("input.txt");

        try (Scanner myReader = new Scanner(myFile)) {
            // System.out.println(myReader.nextLine());
            String data = myReader.nextLine();
            String[] parts = data.split(",");
            for (String string : parts) {
                System.out.println(string);
                splitMinMax(string);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        public static void splitMinMax(String min_max){
            String[] min_and_max = min_max.split("-");
        }

    }
}
