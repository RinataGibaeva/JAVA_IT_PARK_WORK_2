package com.company;

/**
 * Created by Admin on 13.05.2017.
 */
public class human {
    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;

    public human() {
        name = "DEFAULT_NAME";
        age = 0;
        sex = "men";
        height = 0;
        weight = 0;
    }

    public human(String name, int age, String sex, int height, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public human(human original) {
        name = original.name;
        age = original.age;
        sex = original.sex;
        height = original.height;
        weight = original.weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        } else System.err.println("Неккоректный ввод возраста");
    }

    public void setSex(String sex) {
        if (sex == "men" || sex == "women") {
            this.sex = sex;
        } else System.err.println("Неккоректный ввод пола");
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else System.err.println("Неккоректный ввод роста");

    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else System.err.println("Неккоректный ввод веса");
    }
}

