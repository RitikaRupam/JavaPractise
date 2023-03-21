import javax.swing.event.SwingPropertyChangeSupport;

class Account
{
  void deposite(int amount){
    System.out.println("This is a deposite method. Depoited amount is "+amount);
  }  
  void withdrawl(int money)
  {
    System.out.println("This is a withdrawl method. Withdrawl amount is "+money);
  }
}
class SavingAccount extends Account
{
@Override
void deposite(int amount) {
    System.out.println("This is Saving account deposite");
}
}
class CurrrentAccount extends Account{
@Override
void withdrawl(int money) {
    
    System.out.println("This is Current Account withdrawl method");
}
}
public class ISA {
    public static void main(String[] args) {
        Account account=new Account();
        account.deposite(20);
        account.withdrawl(10);
        CurrrentAccount ca=new CurrrentAccount();
        ca.withdrawl(5);
    }
    
    


}
