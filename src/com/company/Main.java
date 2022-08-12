package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        try(FileWriter fileWriter = new FileWriter("abc.txt")){
            fileWriter.write("Aa\nBb\nCc\nDd\nEe\nFf\nGg\nHh\nIi\nJj\nKk\nLl\nMm\nNn\nOo\nPp\nQq\nRr\nSs\nTt\nUu\nVv\nWw\nXx\nYy\nZz\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
        }
        try (FileReader reader =new FileReader("abc.txt")){
            Scanner scanner = new Scanner(reader);
            int i = 1;
            while (scanner.hasNextLine()){
                System.out.println(i + "." + scanner.nextLine());
                i++;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}