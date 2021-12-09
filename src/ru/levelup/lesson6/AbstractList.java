package ru.levelup.lesson6;

public abstract class AbstractList {
    //abstract не можем создать объект класса
    //abstarct может содержать абстрактные методы
    protected int size;//количество элементов в списке

    public abstract void add(int value);

    public int size(){
        return size;
    }
}
