class BankAccount
{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
            this.accountHolder = accountHolder ;
			this.balance = balance;
}

      void deposit(double amount){
		balance += amount;
		System.out.println("Deposited: "+ amount);
		System.out.println("New Balance:  "+ balance);
     }
	 
	  void withdraw(double amount){
		if (balance >= amount)
		{ 
		
		    balance -= amount;
		    System.out.println("Withdrawl: "+ amount);
		    System.out.println("Updated Balance:  "+ balance);
     }
	 else
	      {System.out.println("Insuffienect Balance!!");}
}

      void displayAccount(){
		   System.out.println("Account Holder name: "+ accountHolder);
		   System.out.println("Current Balance: "+ balance);
     }
	 
}
public class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount("Tanisha", 1000000);
		BankAccount b2 = new BankAccount("Vishakha", 1000000);
		
		b2.withdraw(100);
	}
}
