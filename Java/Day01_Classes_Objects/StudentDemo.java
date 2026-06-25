class Student{
    String name;
int rollNo;
String department;

void displayStudent(){
System.out.println("Name: "+name);
System.out.println("Roll No: "+rollNo);
System.out.println("Department: "+department);
}
}

public class StudentDemo{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
s1.name="Ajay";
s1.rollNo=101;
s1.department="MCA";
s2.name="Varun";
s2.rollNo=102;
s2.department=" CSE";

s1.displayStudent();
s2.displayStudent();

    }
}
