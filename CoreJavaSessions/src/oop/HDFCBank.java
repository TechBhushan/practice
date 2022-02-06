package oop;

public class HDFCBank implements Bank1,Bank2//Multiple inheritance
{

	public void customerdata()
	{
		System.out.println("This is customer data");
	}
	public static void main(String[] args)
	{
		HDFCBank h1=new HDFCBank();
		h1.loan();
		
		
		
		Bank1 b1=new HDFCBank();
		b1.deposite();
		b1.withdraw();
		b1.rateofinterest();

	}
	@Override
	public void withdraw()
	{
		System.out.println("This is Withdraw feature from HDFC");
		
	}
	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("This is deposite feature from HDFC");	
		}
	@Override
	public void rateofinterest() {
		System.out.println("Rate of interest from HDFC 9%");
		
	}
	@Override
	public void loan() {
		System.out.println("This isHDFC loan method");
		
	}
	@Override
	public void ATM() {
		// TODO Auto-generated method stub
		
	}

}
