class Vehicle{
    private int vehicleNumber;
    private String brand;

    Vehicle(int vehicleNumber,String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }

    public int getVehicleNumber(){
        return vehicleNumber;
    }
    public String getBrand(){
        return brand;
    }

    public void start(){
        System.out.println("Vehicle Started");
    }
    public void display(){
        System.out.println("VehicleNumber: "+vehicleNumber);
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    private String fuelType;
    Car(int vehicleNumber,String brand,String fuelType){
        super(vehicleNumber,brand);
        this.fuelType=fuelType;
    }
    public void start(){
        
        System.out.println("Car Started");
    }

    public void drive(){
        System.out.println("Car is Driving..");
    }
}

public class VehicleDemo{
    public static void main(String[] args){
       //we create object for Car class using Vehicle class(parent class),we use this only same method is in the both classes only
        //Object is stored in heap ,reference is stored in stack
        //Vehicle is parent class  v is reference variable
        //new Car() here only object created
        Vehicle v=new Car(101,"BMW","Diesel");
        v.start();
        Car c=new Car(102,"AUdi","Both");
        c.display();
        c.drive();

    }
}