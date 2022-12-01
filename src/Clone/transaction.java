package Clone;

public class transaction {
    public static void main (String args[]){
        Account account1 = new Account("Rohit",50000 ,521);
        Account account2 =null;
        Account account3=null;

          try {
              account2 = (Account) account1.clone();
              account2.deposit(20000);
              account3=(Account)account2.clone();
              account3.withdraw(300);
              System.out.println("Nov 20 Trasaction is :" + account1.getAccountname()+" "+account1.getBalance());
              System.out.println("Nov 21 Trasaction is :" + account2.getAccountname()+" "+account2.getBalance());
              System.out.println("Nov 22 Transaction is :" +account3.getAccountname()+" "+account3.getBalance());

              throw new CloneNotSupportedException();
          }
          catch (Exception e){
              System.out.println(e);


          }
    }
}
