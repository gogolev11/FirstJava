package ru.levelup.lesson4;


//parent, superclass, baseclass (базовый классс) - класс от которого унаследовали
//child, subclass - класс который унаследует другой класс
public class Point3D extends Point {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        System.out.println("Point3D");
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
