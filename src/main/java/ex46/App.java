/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        readFile();
    }
    public static void readFile() {
        /*Read the file to find the words*/

        ArrayList<String> input = new ArrayList<>();
        try {
            File myFile = new File("exercise46_input.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                input.add(sc.nextLine());
            }
            sc.close();
            String[] words = new String[input.size()];
            words = input.toArray(words);
            search(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void search(File file){
        Map<String, Integer> Words = new HashMap<>();

        try (Scanner sc = new Scanner(file)){
            sc.useDelimiter("[^A-Za-z]+");
            while (sc.hasNext()) {
                String word = sc.next();
                Integer count = Words.get(word);
                Words.put(word, (count == null) ? 1 : count + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
