class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

BankAccount(int accountNumber,String accountHolder,double balance){
    this.accountNumber=accountNumber;
    this.accountHolder=accountHolder;
    this.balance=balance;
}

public void setAccountHolder(String accountHolder){
    this.accountHolder=accountHolder;
}
public void setBalance(double balance){
    if(balance<=1000.00){
    System.out.println("Minimum balance should be 1000");
    }
    else{
    this.balance=balance;
}
}

public int getAccountNumber(){
    return accountNumber;
}

public String getAccountHolder(){
    return accountHolder;
}

public double getBalance(){
    return balance;
}

public void displayAccount(){
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Holder: "+accountHolder);
    System.out.println("Balance: "+balance);
}
}

public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(101,"Saran",100000.00);
    BankAccount b2=new BankAccount(102,"arun",12000.00);
   
    //set the values using setter methods
    b1.setAccountHolder("Varun");
    b1.setBalance(200000.00);
    System.out.println(account.getBalance());
    b1.displayAccount();
    b2.displayAccount();
    }
}