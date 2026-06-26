class Person{
    String name;

    void displayName(){
        System.out.println("Name: "+name);
    }
}

class Student extends Person{
//Body for the student class
int rollNo;
void displayRollNo(){
System.out.println("RollNo: "+rollNo);
}
}

public class StudentDemo{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Ajay";
        s1.rollNo=103;
        s1.displayName();
        s1.displayRollNo();
    }
}