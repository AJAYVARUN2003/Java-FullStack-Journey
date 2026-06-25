class Laptop{
    String brand;
String processor;
int ram;
int price;

void displayLaptop(){
    System.out.println("Brand: "+brand);
    System.out.println("Processor: "+processor);
    System.out.println("Ram: "+ram);
    System.out.println("Price: "+price);
}
}

public class LaptopDemo{
    public static void main(String[] args){
        Laptop l1=new Laptop();
        Laptop l2=new Laptop();
        l1.brand="Lenovo";
        l1.processor="intel";
        l1.ram=4;
        l1.price=20000;
        l1.displayLaptop();

         l2.brand="Mac";
        l2.processor="ios";
        l2.ram=4;
        l2.price=200000;
        l2.displayLaptop();

    }
}