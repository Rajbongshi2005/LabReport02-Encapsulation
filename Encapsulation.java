class BankAccount
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber,String HolderName,double balance)
    {
        this.accountHolderName=HolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void setAccountNumber(int accountNumber )
    {
        this.accountNumber=accountNumber;
    }
    public int  getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountHolderName(String HolderName )
    {
        this.accountHolderName=HolderName;
    }
    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }

    public void setBalance(double balance)
    {
        if(balance>0){
        this.balance=balance;}
        else{
        System.out.println("Wroung balance");
        }
    }
    public double getBalance()
    {
        return this.balance;
    }

    public void displayInfo()
    {
        System.out.println("Account Name: "+this.accountHolderName + "\nAccount Number: " +this.accountNumber+"\nAccount Balance: "+this.balance+"\n");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount B1=new BankAccount(242002140,"Tushar Rajbongshi", 50000);
        BankAccount B2=new BankAccount(242002100,"Sojal Rajbongshi", 60000);
        BankAccount B3=new BankAccount(242002000,"Drjoy Rajbongshi", 30000);
        B1.displayInfo();
        B2.displayInfo();
        B3.displayInfo();
    }
    
}
