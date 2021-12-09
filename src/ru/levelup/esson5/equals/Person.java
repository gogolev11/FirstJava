package ru.levelup.esson5.equals;

import java.util.Objects;

public class Person {
    private String name;
    private  int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        // 1.Проверить что это один и тот же объект
        if (this==o) return true;
        // 2.Сравнить классы -  у аргумента класс совпадает с текущим
        //первый вариант оператор instanceof
        //<instance> instanceof <classname>
        if (!(o instanceof Person)) return false;
        // второй вариант getClass
        if (o==null||this.getClass()!=o.getClass()) return false;
        // 3. Привести к типу класса и сравнить поля
        Person other =(Person) o;
        return this.age== other.age && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
