package ru.levelup.lesson2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();


        for(int i=0;i<number;i++) {
            System.out.println("Привет мир!");
        }
        int v=1;
        int factorial=1;
        while (factorial<1_000_000 && v<=number) {
            factorial*=v++;
            System.out.println(factorial);
        }

        System.out.println(number+"! = "+factorial);
    }
}
