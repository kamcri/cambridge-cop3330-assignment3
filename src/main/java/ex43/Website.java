/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex43;

import java.io.File;
import java.io.FileWriter;

public class Website{
    String siteName;
    String author;
    //String path;
    public String createWebsite(){
        /*
         * Setting path equal to the directory the user is using
         * then creating a new file with the path
         */
        String path = System.getProperty("user.dir");
        path += "/website/"+siteName;
        File website = new File(path);

        return path;
    }
    public String createJs(){

        String path = System.getProperty("user.dir");

        path +="/website/"+ siteName + "/js";
        File javaS = new File(path);

        return path;
    }
    public String createCSS(){
        String path = System.getProperty("user.dir");

        path += "/website/"+ siteName + "/css";
        File css = new File(path);

        return path;
    }
    public String createHTML(){
        String path = System.getProperty("user.dir");

        path += siteName + "/index.html";

        String html = "<title>"+siteName+"</title>\n<meta>"+author+"</meta>";

        try{
            FileWriter writer = new FileWriter(new File(path));
            writer.write(html);
            writer.close();
            System.out.println("Created " + path+"\\index.html");

            return path;
        }
        catch (Exception ex){
            return "index.html file not created!";
        }
    }
}
