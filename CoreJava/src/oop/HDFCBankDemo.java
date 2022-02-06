package oop;

public class HDFCBankDemo implements Bank1,Bank2 //Multiple Inheritance
{
	public void hdfc()
	{
		System.out.println("This is hdfc bank method");
	}

	public static void main(String[] args)
	{
		Bank1 b1=new HDFCBankDemo();
		b1.deposit();
		b1.rateofinterest();
		b1.withdraw();
		
		HDFCBankDemo h1=new HDFCBankDemo();
		h1.loan();
	}

	@Override
	public void withdraw()
	{
		System.out.println("This is withdraw method");
		
	}

	@Override
	public void deposit()
	{
		System.out.println("This is deposit method");
		
	}

	@Override
	public void rateofinterest()
	{
		System.out.println("Rate of Interest of HDFC is 8%");
		
	}

	@Override
	public void loan()
	{
		System.out.println("This is HDFC loan method");
		
	}

	@Override
	public void ATM()
	{
		System.out.println("This is ATM method");
		
	}

}
