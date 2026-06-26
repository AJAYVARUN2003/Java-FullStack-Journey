class Person{
    String name="Person";
}

class Student extends Person{
    String name="Student";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class SuperDemo{
    public static void main(String[] args){
        Student s1=new Student();
        s1.display();
    }
}