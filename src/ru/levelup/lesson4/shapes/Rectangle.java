package ru.levelup.lesson4.shapes;

public class Rectangle extends Shape {

    public Rectangle(int length, int width){

        //int[] array =new int[]{1,6,8}; заполнение массива
        //или int[] array ={1,6,8};
        super(new int[]{length,width,length,width});
    }

    @Override
    public double square() {
        return sizes[0]*sizes[1];
    }
}
