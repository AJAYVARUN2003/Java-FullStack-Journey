class Employee{
    private int empId;
    private String empName;
    private double salary;


public void setEmpId(int empId){
    this.empId=empId;
}

public void setEmpName(String empName){
    this.empName=empName;
}

public void setSalary(double salary){
    if(salary>0){
    this.salary=salary;
}
else{
    System.out.println("Invalid Salary");
}
}

public int getEmpId(){
    return empId;
}
public String getEmpName(){
    return empName;
}
public double getSalary(){
    return salary;
}
}

public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setEmpId(101);
        e1.setEmpName("Vijay");
        e1.setSalary(10000.00);

        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
        System.out.println(e1.getSalary());
    }
}


