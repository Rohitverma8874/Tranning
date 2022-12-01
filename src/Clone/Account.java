package Clone;

public class Account implements Cloneable{
    private String accountname;
    private double balance;
    private double accountnumber;

    public Account(String accountname,double balance,double accountnumber){
        this.accountname=accountname;

        if(balance>0.0)
            this.balance=balance;
    }
    public void withdraw(double withdrawAmount){
        if (withdrawAmount>0.0)
            balance=balance-withdrawAmount;
    }
    public void deposit(double depositAmount){
        if (depositAmount>0.0)
            balance=balance+depositAmount;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountname(String accountname){
        this.accountname=accountname;
    }
    public String getAccountname(){
        return accountname;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
