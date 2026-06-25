class BankAccount{
    int accountNumber;
String accountHolder;
double balance;

void displayAccount(){
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Holder: "+accountHolder);
     System.out.println("Balance: "+balance);
}
}

public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount b1=new BankAccount();
         BankAccount b2=new BankAccount();
          BankAccount b3=new BankAccount();

          b1.displayAccount();
          b2.displayAccount();
          b3.displayAccount();

    }
}