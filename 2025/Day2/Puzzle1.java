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
                splitMinMax(string);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void splitMinMax(String min_max){
        String[] min_and_max = min_max.split("-");
        String min = min_and_max[0];
        String max = min_and_max[1];
        checkInValidID(Long.parseLong(min), Long.parseLong(max));
    }

    public static long checkInValidID(long min, long max){
        System.out.print("min: ");
        System.out.println(min);
        System.out.print("max: ");
        System.out.println(max);
        
        for (long i = min; i < max; i++){
            System.out.println(i);
            
        }

        return 0;
        
    }
}