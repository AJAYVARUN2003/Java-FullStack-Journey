class Shape{

void draw(){
    System.out.println("Draw which shape you want");
}
}


class Circle extends Shape{
void displayCircle(){
    System.out.println("Draw a circle");
}
}

class Rectangle extends Shape{
void displayRectangle(){
    System.out.println("Draw a rectangle");
}
}

public class HierarchicalDemo{
    public static void main(String[] args){
        //Object creation for two classes
        Rectangle r1=new Rectangle();
        Circle c1=new Circle();
        //method call 
        r1.draw();
        c1.draw();
        c1.displayCircle();
        r1.displayRectangle();
    }
}