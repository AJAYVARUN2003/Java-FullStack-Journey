class Employee{
    int empId;
String empName;
double salary;

void displayEmployee(){
    System.out.println("Employee Id: "+empId);
     System.out.println("Employee Name: "+empName);
      System.out.println("Employee Salary: "+salary);
}
}

public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.empId=101;
        e1.empName="Varun";
        e1.salary=90000.00;

         e2.empId=102;
        e2.empName="arun";
        e2.salary=10000.00;

         e3.empId=103;
        e3.empName="saran";
        e3.salary=20000.00;

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();

    }
}

