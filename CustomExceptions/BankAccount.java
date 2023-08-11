/*Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message*/
import java.util.Scanner;
class InsufficientFundsException extends Exception
{
  InsufficientFundsException(String message)
  {
    super(message);
  }
}
class NotSufficientFundException extends Exception
  {
    NotSufficientFundException(String message1)
    {
      super(message1);
    }
  }
class WithDrawMoney
  {
    int balance=10000;
    public void withDraw(int amount)throws InsufficientFundsException
    {
      if(amount>=balance)
      {
        throw new InsufficientFundsException("with drawl amount is greater than the balance amount so with is not posible");
          }
            else
      {
          balance=balance-amount;
        System.out.println("the balance amount after withdraw"+balance);
            }
          }
  }
class DepositeMoney
  {
    int balance1=10000;
    public void deposite(int amount1)throws NotSufficientFundException
    {
      if(amount1<=0)
      {
        throw new NotSufficientFundException("amount should be greater than zero");
      }
      else{
        balance1=amount1+balance1;
        System.out.println("after depositing the amount "+balance1);
      }
    }
  }
class BankAccount
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter amount for withdraw");
      int amount=sc.nextInt();
      System.out.println("enter the amount for depositing");
      int amount1=sc.nextInt();
      try
        {
        WithDrawMoney w=new WithDrawMoney();
          w.withDraw(amount);
      }
      catch(InsufficientFundsException e)
        {
          System.out.println(e);
        }
      System.out.println(" with draw exception is handeled");
      try{
         DepositeMoney dp=new  DepositeMoney();
        dp.deposite(amount1);
      }
      catch(NotSufficientFundException ex)
        {
          System.out.println(ex);
        }
      System.out.println("deposite exception is handled");
    }
  }

