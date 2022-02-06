package controlflowstatements;

public class MethodChaining {
	
	
	public MethodChaining openbrowser()
	{
		System.out.println("open browser");
		return this;
	}
	
	public MethodChaining runbrowser()
	{
		System.out.println("run browser");
		return this;
	}
	
	public MethodChaining closebrowser()
	{
		System.out.println("close browser");
		return this;
	}

	public static void main(String[] args)
	{

		MethodChaining m=new MethodChaining();
        m.openbrowser().runbrowser().closebrowser();

	}

}
