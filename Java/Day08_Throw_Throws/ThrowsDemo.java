public class ThrowsDemo{
    static void checkAge(int age) throws ArithmeticException{
            if(age<18){
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Eligible");
        }
    public static void main(String[] args){
try{
        checkAge(20);
    }

    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }

    System.out.println("Program End");
}
}
