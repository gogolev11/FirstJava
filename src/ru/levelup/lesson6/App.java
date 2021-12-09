package ru.levelup.lesson6;

public class App {
    public static void main(String[] args) {
        //объект списка -первоначально список пуст
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add(5);//добавили первый элемент списка
        dynamicArray.add(60);
        dynamicArray.add(23);

        dynamicArray.add(45);
        dynamicArray.add(88);
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));

        }
    }
}
