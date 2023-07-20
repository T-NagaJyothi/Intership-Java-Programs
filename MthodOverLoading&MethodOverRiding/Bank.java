/*Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:

deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description*/
class BankAccount
  {
    void deposite(int balanceAmount)
    {
      int deposite=1000;
      System.out.println("the balance amount is"+balanceAmount);
      deposite=deposite+balanceAmount;
      System.out.println("after depositing the balanace amount is"+deposite);
    }
    void deposite(int amount,String description)
    {
      System.out.println(description);
    }
    void withdraw(int withDraw)
    {
      int amount=10000;
      if(amount>withDraw){
       withDraw=amount-withDraw;
      System.out.println("after withdraw the balace amount is"+withDraw);
    }
      else
        System.out.println("insufficient amount");
    }
    void withdraw(int amount,String description)
    {
      System.out.println("the withdraw amount is"+amount);
      System.out.println(description);
    }
  }
class Bank
  {
    public static void main(String[] args)
    {
      BankAccount ba=new BankAccount();
      ba.deposite(10000);
        ba.deposite(10000,"Deposited successfully");
      ba.withdraw(2000,"Withdraws successfully");
      ba.withdraw(2000);
      
    }
  }