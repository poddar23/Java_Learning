package classwork;
import java.util.Scanner;

class Account
{
	double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public boolean isAmountExist(double amt)
	{
		boolean b = false;
		if(balance>=amt)
		{
			b = true;
		}
		
		return b;
	}
	
	public void withdraw(double amt)
	{
		balance = balance-amt;
		System.out.println("Amount withdraw, current balance is : "+balance);
	}
	
}
class Customer implements Runnable
{
	String name;
	Account account;
	
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	
	public void run() {
		
		synchronized (account) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter amount to withdraw by : "+name);
			double amt = sc.nextDouble();
			
			if(account.isAmountExist(amt))
			{
			  account.withdraw(amt);	
			}
			else
			{
				System.out.println("Insufficent amount");
			}
		}
	}
	
}

public class Syncronised {
     public static void main(String[] args) {
		
    	 Account account = new Account(10000);
  
		Customer c1 = new Customer("Rahul",account);
 		Customer c2 = new Customer("Mayank",account);
		
 		Thread th1 = new Thread(c1);
 		Thread th2 = new Thread(c2);
 		
 		th1.start();
 		th2.start();
	}      
}
