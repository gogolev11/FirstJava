package ru.levelup.esson5.equals;

public class App {
    public static void main(String[] args) {
        Person person1 =new Person("ivan",22);
        Person person2 =new Person("ivan",22);
        Person person3= person1;
        int intValue1=45;
        int intValue2=45;

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person1));

        System.out.println(person1.equals("Ivan")); //ошибка ClasCastException



    }
}
