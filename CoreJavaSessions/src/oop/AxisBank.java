package oop;

public class AxisBank implements Bank1
{
	public void customerdata()
	{
		System.out.println("This is customer data....");
	}

	public static void main(String[] args) 
	{
			Bank1 b1=new AxisBank();
			b1.deposite();

	}

	@Override
	public void withdraw() {
		System.out.println("This is Axis bank Withdraw Method");
		
	}

	@Override
	public void deposite() {
		System.out.println("This is Axis bank Deposite Method");
	}

	@Override
	public void rateofinterest() {
		System.out.println("Axis Bank rate of interest is 7.9%");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ATM() {
		// TODO Auto-generated method stub
		
	}

}
