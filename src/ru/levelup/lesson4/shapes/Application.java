package ru.levelup.lesson4.shapes;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(6,8);
        double recPerimetr = rectangle.perimetr();
        System.out.println("perimetr"+recPerimetr);

        double recSquare = rectangle.square();
        System.out.println("rectangle square"+recSquare);

        Triangle triangle =new Triangle(3,4,5);
        double trianglePerimetr=triangle.perimetr();
        System.out.println("Triangle perimeter"+triangle.perimetr());

        System.out.println("triangle square"+ triangle.square());
    }
}
