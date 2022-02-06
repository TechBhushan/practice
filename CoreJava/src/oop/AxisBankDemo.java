package oop;

public class AxisBankDemo implements Bank1
{

	public void axis()
	{
		System.out.println("This is Axis bank method");
	}
	
	
	public static void main(String[] args)
	{
		
		AxisBankDemo h1=new AxisBankDemo();
		h1.axis();
		h1.ATM();
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
		System.out.println("Rate of Interest of Axis is 9%");
		
	}


	@Override
	public void loan()
	{
		System.out.println("This is Axis loan method");
		
	}


	@Override
	public void ATM() 
	{
		System.out.println("This is ATM method");
		
	}

}
