/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        /*
        * Read from file and store the names in an Array list.
        * Convert to an Array.
        * Call split function on each line.*/

        ArrayList<String> input = new ArrayList<>();
        try {
            File myFile = new File("exercise42_input.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                input.add(sc.nextLine());
            }
            sc.close();
            String[] str = new String[input.size()];
            str = input.toArray(str);
            System.out.println("Last\t\t\tFirst\t\t\tSalary");
            System.out.println("-------------------------------------");
            for(String x: str){
                split(x);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void split(String x){
        /*
        * This function takes the array and splits the string every time
        * there is a comma, then prints it. This is done for
        * every line read from the text file. */

        String[] input = x.split(",");
        for(int i = 0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++) {
                for(int k = j+1; k < input.length; k++){
                    System.out.format("%-8s\t\t%-8s\t\t%-8s\n", input[i], input[j], input[k]);
                }
            }
        }
    }
}
