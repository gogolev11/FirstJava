package ru.levelup.lesson4.shapes;
//perimeter()
//square()
public class Shape {
    //size=[5,3,5,3]
    protected int[] sizes;

    public  Shape(int[] sizes) {
        this.sizes=sizes;
    }

    public double perimetr() {
        double perimetr = 0;
        for (int i = 0; i < sizes.length; i++) {
            perimetr +=sizes[i];

        }
        return 0;
    }

    public double square(){
        return 0;
    }
}
