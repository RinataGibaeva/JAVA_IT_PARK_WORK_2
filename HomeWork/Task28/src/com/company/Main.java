package com.company;

public class Main {

    public static void main(String[] args) {
        Staff staff1 = new Staff("Маша");
        Staff staff2 = new Staff("Даша");
        Staff staff3 = new Staff("Паша");
        Staff staff4 = new Staff("Саша");
        Staff staff5 = new Staff("Таша");

        Table table = new Table(1);
        table.ChooseATable(staff1);

        Table table2 = new Table(2);
        table.ChooseATable(staff2);

        Table table3 = new Table(3);
        table.ChooseATable(staff3);

        Table table4 = new Table(4);
        table.ChooseATable(staff4);

        Table table5 = new Table(5);
        table.ChooseATable(staff5);










    }
}
