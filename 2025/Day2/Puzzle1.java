package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle1 {
    public static long total = 0;
    public static void main(String[] args) {
        File myFile = new File("input.txt");

        try (Scanner myReader = new Scanner(myFile)) {

            String data = myReader.nextLine();
            String[] parts = data.split(",");

            for (String string : parts) {
                splitMinMax(string);
            }

            System.out.println(total);
            
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

        
        for (long i = min; i < max; i++){

            int stringLength = String.valueOf(i).length();
            
            String firstHalf = String.valueOf(i).substring(0, stringLength/2);
            String secondHalf = String.valueOf(i).substring(stringLength/2, stringLength);

            if (firstHalf.equals(secondHalf)){
                addNumber(i);
            }
        }
        return 0;
        
    }

    public static void addNumber(long i){
        total += i;
    }
}