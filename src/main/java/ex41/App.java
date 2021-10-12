/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception {
        readFile();
    }
    public static void readFile() throws Exception {
        /*
        * Reads everything from file into an ArrayList. After reading,
        * the list is converted into an array, so it can be sorted.
        * */

        ArrayList<String> input = new ArrayList<>();
        try {
            File myFile = new File("exercise41_input.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                input.add(sc.nextLine());
            }
            sc.close();
            String[] names = new String[input.size()];
            names = input.toArray(names);
            sort(names);
            write(names);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void sort(String[] input){
        //Sort the array alphabetically
        Arrays.sort(input);
    }
    public static void write(String[] input) throws Exception{
        //Use the file writer to print the array to the output file

        FileWriter writer = new FileWriter("exercise41_output.txt");
        int length = input.length;
        writer.write("Total of "+length+" names\n");
        writer.write("------------------\n");
        for(int i = 0; i < length; i++)
        {
            writer.write(input[i]+"\n");
        }
        writer.close();
    }
}


