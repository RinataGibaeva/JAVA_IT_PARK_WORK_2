package com.company;


public class Staff {
    private String staff;

    public Staff(String staff) {
        this.staff = staff;
    }

    public void show() {
        System.out.println("Здравствуйте, меня зовут " + staff + ". Cегодня я Вас буду обслуживать");
    }
}
