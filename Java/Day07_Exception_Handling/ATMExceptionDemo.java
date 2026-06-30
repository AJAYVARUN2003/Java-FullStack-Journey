public class ATMExceptionDemo{
    public static void main(String[] args){
        double balance=5000;
        double withdrawAmount=6000;

        try{
            if(withdrawAmount>balance){
                System.out.println("Insufficient Balance");
            }
            else{
                System.out.println("Transaction successful");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }

        finally{
            System.out.println("Thank you for using our ATM");
        }
    }
}