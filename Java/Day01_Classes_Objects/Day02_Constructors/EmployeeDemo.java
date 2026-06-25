class Employee{
   int  empId;
String empName;
double salary;

Employee(int id,String name,double salary){
    empId=id;
    empName=name;
    this.salary=salary;
}

void displayEmployee(){
    System.out.println("Employee Id: "+empId);
    System.out.println("Employee Name: "+empName);
    System.out.println("salary: "+salary);
}
}

public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1=new Employee(101,"Vetri",20000.00);
        Employee e2=new Employee(102,"Varun",100000.29);
        e1.displayEmployee();
        e2.displayEmployee();

    }
}
