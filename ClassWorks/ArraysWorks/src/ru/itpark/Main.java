package ru.itpark;

public class Main {
    /**
     * Переменная глобальная для addToEndOfArray
     * и для main
     */
    public static int count = 0;

    /**
     * Процедура добавления элемента в массив
     *
     * @param a     - массив, куда надо добавить элемент
     * @param value - значение, которое нужно добавить
     */
    public static void addToEndOfArray(int a[], int value) {
        addToIndexOfArray(a, value, count);
    }

    /**
     * Кладет значение в начало массива
     *
     * @param a
     * @param value
     */
    public static void addToBeginOfArray(int a[], int value) {
        addToIndexOfArray(a, value, 0);
    }

    public static void addToIndexOfArray(int a[], int value, int index) {
        for (int i = count; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        count++;
    }

    public static void removeByIndex(int a[], int index) {
        for (int i = count; i > index; i--) {
            a[index] = a[i + 1];
        }
        count--;
    }

    public static int indexOf (int a[], int value) {
        for (int i = 0; i < count; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void removeByValue(int a[], int value) {
       int indexOf
    }

    public static void main(String[] args) {
        int animalsWeight[] = new int[10];
        /*
        animalsWeight[0] = 13;
        animalsWeight[1] = 15;
        animalsWeight[2] = 11;
        animalsWeight[3] = 8;
        animalsWeight[4] = 9;
        */
        addToEndOfArray(animalsWeight, 13);
        addToEndOfArray(animalsWeight, 15);
        addToEndOfArray(animalsWeight, 11);
        addToEndOfArray(animalsWeight, 8);
        addToEndOfArray(animalsWeight, 9);
        addToBeginOfArray(animalsWeight, 100);
        addToEndOfArray(animalsWeight, 777);
        addToIndexOfArray(animalsWeight, 66, 3);
        removeByIndex(animalsWeight, 2);
        for (int i = 0; i < count; i++) {
            System.out.println(animalsWeight[i]);
        }

    }
}