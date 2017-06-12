package com.company;
import java.util.Random;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        List ml1 = new List();

        for (int i = 0; i <= 17000; i++) {
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder randString = new StringBuilder();
            int count = (int)(Math.random() * 30);
            for(int j = 0; j < count; j++)
                randString.append(symbols.charAt((int)(Math.random() * symbols.length())));
            ml1.addBack(randString.toString() + " " + rand.nextInt(100));
        }

        File myFile = new File("text.txt");
        try {
        }

        ml1.printList();
        System.out.println();




    }
}
