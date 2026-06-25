class Car{
    String brand;
String model;
int price;

void displayCar(){
    System.out.println("Car Brand: "+brand);
    System.out.println("Model: "+model);
    System.out.println("Price: "+price);
}
}

public class CarDemo{
    public static void main(String[] args){
        Car c1=new Car();
        c1.brand="Toyota";
        c1.model="Innova";
        c1.price=2500000;
        Car c2=c1;

        c2.brand = "Honda";
        System.out.println(c1.brand);
System.out.println(c2.brand);

    }
}