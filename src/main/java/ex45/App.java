/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex45;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Output file name:");
        String outputFile = sc.nextLine();

        readFile readF = new readFile();

        readF.read();

        ArrayList<String> list = readF.newlist();

        writeFile wr = new writeFile(outputFile, list);
        wr.writeFile();
    }
}
class readFile {
    private ArrayList<String> list;
    private Scanner sc;

    public readFile() throws FileNotFoundException {
        /*Using the path to create a new file with*/
        list = new ArrayList<>();
        String path = System.getProperty("user.dir");
        path = path + "exercise45_input.txt";
        File file = new File(path);
        sc = new Scanner(file);
    }
    public void read(){
        /*Reads everything into the array list*/
        try {
            int i = 0;
            while (sc.hasNext()) {
                String content = sc.nextLine();
                list.add(content);
            }
        }
        finally {
            sc.close();
        }
    }
    public ArrayList<String> newlist(){
        return list;
    }
}
class writeFile {
    private ArrayList<String> list;
    private FileWriter writer;

    public writeFile(String name, ArrayList<String> list) throws IOException {
        writer = new FileWriter("outputFile");
        this.list = list;
    }

    public void writeFile() throws IOException {
        /*For loop that will check each word in the array list
         * and compares it to the string "utilize".*/
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String string = "utilize";
            int ind = 0;
            str = str.replaceAll("utilize", "use");
            writer.write(str + "\n");
            }
            writer.close();
        }
}