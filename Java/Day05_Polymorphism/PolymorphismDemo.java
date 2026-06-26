class Calculator{

    void add(int a,int b){
       int c=a+b;
       System.out.println("Total: "+c);
    }

    void add(int a,int b,int c){
       int d=a+b+c;
       System.out.println("Total: "+d);
    }
    void add(double a,double b){
       double c=a+b;
       System.out.println("Total: "+c);
    }
}

public class PolymorphismDemo{
    public static void main(String[] args){
        Calculator c1=new Calculator();
        c1.add(10,20);
        c1.add(100,101,10);
        c1.add(10.4,20.4);
    }
}