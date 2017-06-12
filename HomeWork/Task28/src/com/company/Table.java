package com.company;

public class Table {
    private final int Max_Tables = 5;
    private Table tables[];
    private int countOfTable;

    public Table(int countOfTable) {
        this.tables = new Table[Max_Tables];
        this.countOfTable = 0;
    }

    public void ChooseATable(Staff staff) {
        if (countOfTable < Max_Tables) {
            tables[countOfTable] = Table;
            countOfTable++;
        } else {
            System.err.println("К сожалению, других столов нет!");
        }
    }

    public void SitDown() {
        for (int i = 0; i < countOfTable; i++) {
            tables[i].show();
        }
    }
}
