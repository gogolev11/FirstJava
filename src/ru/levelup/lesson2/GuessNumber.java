package ru.levelup.lesson2;

import java.util.OptionalInt;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int secretNumber=3;
        int number =(587*2345/66)%5;
        if (number>=secretNumber){
            System.out.println(number+" больше чем "+secretNumber);
        } else {
            System.out.println(number+" меньше чем "+secretNumber);
        }

    }
}
