package ru.levelup.lesson3;

public class Application {
    public static void main(String[] args) {
        //объявили переменную типа Product
        Product phone= new Product();
        phone.name="Phone";
        phone.weight=120.34;
        phone.vendorCode="AR2345";
        phone.price=1000;

        Product laptop = new Product();
        laptop.name="Laptop Lenovo";
        laptop.weight=210.45;
        laptop.vendorCode="LL4352";
        laptop.price=10000;

        System.out.println(phone.name+" "+phone.weight+" "+phone.vendorCode);
        System.out.println(laptop.name+" "+laptop.weight+" "+laptop.vendorCode);

        String phonePair = phone.createPairOfVendorCodeAndName();
        System.out.println(("Phone pair: "+phonePair));
        System.out.println("Laptop pair:"+ laptop.createPairOfVendorCodeAndName());

        System.out.println();
        double phoneDiscountPrice = phone.calculatePriceWithDiscount(30);
        int laptopDiscount=50;
        double laptopDiscountPrice=laptop.calculatePriceWithDiscount(laptopDiscount);

        System.out.println("Phone discount"+phoneDiscountPrice);
        System.out.println("Laptop discount"+laptopDiscountPrice);

        laptop.displayProductInfo();
        laptop.displayProductInfo(75);
        laptop.displayProductInfo(35);

        Product mouse =new Product( "Дщпшеуср", "ML435");

    }
}
