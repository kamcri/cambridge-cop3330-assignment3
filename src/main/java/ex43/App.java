/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ex43;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String jsFolder, cssFolder, author, siteName;

        System.out.print("Site name:");
        siteName = sc.nextLine();
        System.out.print("Author:");
        author = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript?");
        jsFolder = sc.nextLine();
        System.out.print("Do you want a folder for CSS?");
        cssFolder = sc.nextLine();

        Website createWeb = new Website();
        createWeb.siteName = siteName;
        createWeb.author = author;

        System.out.println("Created "+createWeb.createWebsite());
        System.out.println("Created "+createWeb.createHTML());

        if(jsFolder.equals("y"))
        {
            System.out.println("Created "+createWeb.createJs());
        }

        if(cssFolder.equals("y"))
        {
            System.out.println("Created "+createWeb.createCSS());
        }
    }
}
