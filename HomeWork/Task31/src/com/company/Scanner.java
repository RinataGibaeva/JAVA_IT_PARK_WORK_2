package com.company;

import java.io.InputStream;

public class Scanner {
    private InputStream input;

    public Scanner(InputStream input) {
        this.input = input;
    }

    public int nextInt() throws Exception {
        int bytes[] = new int[20];
        int byteFromFile = input.read();
        int i = 0;
        while (byteFromFile != -1) {
            bytes[i] = byteFromFile;
            i++;
            byteFromFile = input.read();
        }

        int f = 10;
        int number = 0;
        for (int j = i; j > 0; i--) {
            number = number + bytes[j] * f;
        }

        return number;
    }
}

