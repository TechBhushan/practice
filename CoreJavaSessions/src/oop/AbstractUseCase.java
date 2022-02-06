package oop;

public class AbstractUseCase extends AbstarctClassDemo
{

	public static void main(String[] args) 
	{
		AbstractUseCase a1=new AbstractUseCase();
		a1.accept();
		a1.display();

	}

	@Override
	public void display() {
		System.out.println("Provide all client data");
		
	}

}
