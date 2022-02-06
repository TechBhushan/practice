package controlflowstatements;

public class Person 
{
	//this keyword: whenever you are going to refer current class object then use this keyword.
	public Person startBrowser()
	{
		System.out.println("Browser is Start....");
		return this;
	}

	public Person openApplication()
	{
		System.out.println("Application is Open....");
		return this;
		
	}
	
	public Person closeBrowser()
	{
		
		System.out.println("Browser is close......");
		return this;
	}
	
	public static void main(String[] args)
	{

		Person p1=new Person ();
		
		p1.startBrowser().openApplication().closeBrowser();
		
		
		//p1.startBrowser().openApplication()
		
		
		
//		p1.startBrowser();
//		p1.openApplication();
//		p1.closeBrowser();

	}

}
