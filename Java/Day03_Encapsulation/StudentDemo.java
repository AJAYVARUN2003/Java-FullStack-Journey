class Student{
   private int studentId;
private String studentName;
private String department;
private double cgpa;


Student(int studentId,String studentName,String department,double cgpa)
{
this.studentId=studentId;
this.studentName=studentName;
this.department=department;
this.cgpa=cgpa;
}

public void setStudentId(int studentId){
    this.studentId=studentId;
}

public void setStudentName(String studentName){
    this.studentName=studentName;
}

public void setDepartment(String department){
    this.department=department;
}

public void setCgpa(double cgpa){
    if(cgpa>=0.0 && cgpa<=10.0){
    this.cgpa=cgpa;
}
else{
    System.out.println("Invalid CGPA");
}
}

public int getStudentId(){
    return studentId;
}

public String getStudentName(){
    return studentName;
}

public String getDepartment(){
    return department;
}

public double getCgpa(){
    return cgpa;
}

public void displayStudent(){
System.out.println("Student ID: "+studentId);
System.out.println("Student Name: "+studentName);
System.out.println("Department :"+department);
System.out.println("CGPA: "+cgpa);
}
}

public class StudentDemo{
    public static void main(String[] args){
        Student s1=new Student(101,"Ajay","MCA",8.5);
        Student s2=new Student(102,"Varun","CSE",9.2);
        Student s3=new Student(103,"Arun","IT",9.5);
        s1.setStudentName("Ajay Kumar");
        s2.setCgpa(9.7);
        s3.setCgpa(8.0);
        System.out.println(s1.getStudentName());
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}