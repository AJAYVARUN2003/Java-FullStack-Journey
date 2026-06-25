class Laptop{
    String brand;
String processor;
int price;

Laptop(String brand,String processor,int price){
    this.brand=brand;
this.processor=processor;
this.price=price;
}

void displayLaptop(){
    System.out.println("Laptop Brand: "+brand);
    System.out.println("Processor: "+processor);
    System.out.println("Price: "+price);
}
}

public class LaptopDemo{
    public static void main(String[] args){
        //object creation and constructor automatically called when object is created
        Laptop l1=new Laptop("Lenovo","intel",10000);
        Laptop l2=new Laptop("HP","AMD",20000);
        Laptop l3=new Laptop("Mac","ios",113000);
//calling method using reference variable
l1.displayLaptop();
l2.displayLaptop();
l3.displayLaptop();
    }
}
