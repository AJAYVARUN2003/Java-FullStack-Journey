class Vehicle{
    void start(){
        System.out.println("Vehicle started...");
    }

}

class Car extends Vehicle{
    void drive(){
        System.out.println("Car started...");
    }
}

public class CarDemo{
    public static void main(String[] args){
        Car c1=new Car();
        c1.start();
        c1.drive();
    }
}