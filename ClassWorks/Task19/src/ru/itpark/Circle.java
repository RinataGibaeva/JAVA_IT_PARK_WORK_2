package ru.itpark;

public class Circle extends Figure {
    int r;

    public Circle(String name, int a, int b, int h) {
        super(name);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int area() {
        return (int)Math.PI * r * r;
    }

    @Override
    public int perimeter() {
        return (int)(2 * Math.PI * r);
    }


}
