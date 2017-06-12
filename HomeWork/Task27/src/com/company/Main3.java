package com.company;

public class Main3 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.addToBegin(5);
        a.addToBegin(7);
        a.addToBegin(6);
        a.addToBegin(4);
        a.addToBegin(6);
        a.addToBegin(1);

        ArrayList b = new ArrayList();
        b.addToBegin(10);
        b.addToBegin(19);
        b.addToBegin(1);
        b.addToBegin(11);
        b.addToBegin(2);
        b.addToBegin(11);

        ArrayList c = ArrayList.doub(a,  b);

        for (int i = 0; i < c.getCount(); i++) {
            System.out.println(c.get(i));
        }

        a.removeDoub();
        for (int i = 0; i < a.getCount(); i++) {
            System.out.println(a.get(i));
        }
    }
}