package ru.levelup.lesson4;

public class PointApp {
    public static void main(String[] args) {
        Point a=new Point(5,6);
        int aX=a.getX();
        int aY=a.getY();
        System.out.println("Координаты "+aX+" "+aY);

        a.setX(10);
        a.setY(5);

        Point3D point3D= new Point3D(6,7, 8);
    }
}
