class Mobile{
String brand;
int price;

Mobile(){
    System.out.println("Default Constructor");
}

Mobile(String brand){
    this.brand=brand;
}
    

Mobile(String brand,int price){
    this.brand=brand;
    this.price=price;
}

void displayMobile(){
        System.out.println("Mobile Brand: "+brand);
     System.out.println("Price: "+price);
    }
}

public class MobileDemo{
    public static void main(String[] args){
        Mobile m1 = new Mobile();
Mobile m2 = new Mobile("Samsung");
Mobile m3 = new Mobile("Apple", 120000);
m1.displayMobile();
m2.displayMobile();
m3.displayMobile();
}
}
