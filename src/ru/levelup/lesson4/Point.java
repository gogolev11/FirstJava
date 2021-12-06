package ru.levelup.lesson4;
//(x,y)
//4 acess modificators
//1Private - к полям и методам можно обратиться внутри класса
// 2default-package -нет модификатора доступа - доступ внутри пакета
// 3protected -доступ внутри пакета и в классах наследниках
// 4public - доступ везде
public class Point {
    private int x;
    private int y;

    //constructor
    //setter/getter

    public Point() {
        this(2,2); //вызов из какого нибудь конструктора в этом классе
    }

    //AllArgsConstruktor -конструктор со всеми параметрами
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println("Point");
    }

    //getter- метод возвращающий значение какого-либо поля
    //public <field_type> get<field_name> {return <field>}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //setter -метод, который устанавливает значение в поле
    //public set<field_name>(<field_type><field>) {this.<field>}


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
