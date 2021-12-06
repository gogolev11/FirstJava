package ru.levelup.lesson4.shapes;

public class Triangle extends Shape {
    public Triangle(int a, int b, int c) {
        super(new int[]{a,b,c});
    }

    @Override
    public double square() {
        double halfP=perimetr()/2;
        return Math.sqrt(halfP*(halfP-sizes[0])*(halfP-sizes[1])*(halfP-sizes[2]));
    }
}
