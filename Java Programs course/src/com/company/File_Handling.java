package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class File_Handling {
    public static void main(String[] args) {
//        Code to create a new file
        /*
        File myFile=new File("asifhappy");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Not created new file");
            e.printStackTrace();
        }

//        code to write in the file
//        FileWriter fileWriter= null;
        try {
            FileWriter fileWriter = new FileWriter("asifhappy");
            fileWriter.write("This is the first file of the java");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//Reading a file
        File readFile=new File("asifhappy");
        try {
            Scanner sc=new Scanner(readFile);
            while (sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
//        Deleting the file
        File readFile = new File(" asifhappy");
        if (readFile.delete()) {
            System.out.println("I have deleted this file " + readFile.getName());
        }
        else
        {
            System.out.println("Some error occoured while deleting");
        }
    }
   }


