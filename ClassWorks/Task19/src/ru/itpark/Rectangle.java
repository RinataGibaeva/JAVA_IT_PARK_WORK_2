package ru.itpark;


public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int area() {
        return a * b;
    }

    @Override
    public int perimeter() {
        return 2 * a + 2 * b;
    }


}
