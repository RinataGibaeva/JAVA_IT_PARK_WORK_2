package com.company;

/**
 * Created by Admin on 13.05.2017.
 */
public class Animals {
    String name;
    String country;
    String kind;
    int age;
    int  height;
    int weight;

    Animals() {
        name = "DEFAULT_NAME";
        country = "Country";
        kind = "kind";
        age = 0;
        height = 0;
        weight = 0;
    }

    Animals(String name, String country, String kind, int age, int height, int weight) {
        this.name = name;
        this.country = country;
        this.kind = kind;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Animals(Animals original) {
        name = original.name;
        country = original.country;
        kind = original.kind;
        age = original.age;
        height = original.height;
        weight = original.weight;
    }

}
