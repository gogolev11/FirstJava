package ru.levelup.lesson2;

public class TypeCast {
    public static void main(String[] args) {
        int intVar=5453;
        long longVar=intVar; //неявное приведение, расширяющее приведение(тип занимающий меньше памяти к типу больше памяти)

        byte b=(byte)intVar; //явное сужающее приведение (диапозон байта до 127)

        byte b1=(byte)128;
        byte b2=(byte)129;
        byte b3=(byte)130;
        byte b4=(byte)131;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
