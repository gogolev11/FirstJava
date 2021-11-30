package ru.levelup.lesson3;

public class Product {
    //Поля - переменная внутри класса
    String name;
    String vendorCode;
    double weight;
    double price;
    //конструктор
    Product() {

    }

    Product (String name, String vendorCode){
        this.name=name;
        this.vendorCode=vendorCode;
    }
    //Методы
    //<тип возращаемого значения> имяМетода(<тип аргумента1> <имя аргумента1>,<тип аргумента2> <имя аргумента2>) {}
    //тип возвращаемого значения void - не возвращает результат

    //получить строку vendorCode:name
    String createPairOfVendorCodeAndName() {
        String r=vendorCode+":"+name;
        return r;
    }

    //Рассчет скидки
    double calculatePriceWithDiscount(int discountPercent) {
        if (discountPercent<0||discountPercent>=100) {
            System.out.println("Discount is less than 0 or grater than 100");
            return price;
        }
        double discount= discountPercent/100.0;// int/double=double
        double priceMultiplier=1-discount;
        return price*priceMultiplier;
    }
    //Сигнатура метода - имя метода + список типов аргументов
    //сигнатура для double calculatePriceWithDiscount(int discountPercent) - calculatePriceDiscount(int)
    void displayProductInfo(){
        System.out.println(name+" "+weight+" "+vendorCode+" "+price);
    }
    //перегрузка - одинаковые по названию методы с разным набором аргументов
    void displayProductInfo(int discountPercent) {
        double priceWithDiscount = calculatePriceWithDiscount(discountPercent);
        System.out.println(name+" "+weight+" "+vendorCode+" "+price+"("+priceWithDiscount+")");

    }
}