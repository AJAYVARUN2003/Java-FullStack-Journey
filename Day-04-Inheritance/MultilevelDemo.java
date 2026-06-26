class Person{
    void showName(){
        System.out.println("Hello ");
    }

    void showName(String name){
        System.out.println("Name: "+ name);
    }
}

class Employee extends Person{
    void showSalary(){
       System.out.println("1000 ruppes"); 
    }

     void showSalary(int salary){
       System.out.println("Salary: "+salary+" ruppees"); 
    }
}

class Manager extends Employee{
    void showDepartment(){
        System.out.println("Department");
    }
     void showDepartment(String dept){
       System.out.println("Department:"+dept); 
    }
}

public class MultilevelDemo{
public static void main(String[] args){
Manager m1=new Manager();
m1.showName("Prakash");
m1.showSalary(10000);
m1.showDepartment("MCA");
}
}