package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Animals DOG = new Animals("Husky","Russia","dog", 3, 80, 6);
        Animals CAT = new Animals("KOT", "USA", "cat", 5, 30, 4);

        System.out.println(DOG.name + ' ' + DOG.country + ' ' + DOG.kind + ' ' + DOG.age + ' ' + DOG.height + ' ' + DOG.weight);
        System.out.println(CAT.name + ' ' + CAT.country + ' ' + CAT.kind + ' ' + CAT.age + ' ' + CAT.height + ' ' + CAT.weight);
    }
}
