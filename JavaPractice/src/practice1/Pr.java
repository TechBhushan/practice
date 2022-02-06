package practice1;

public class Pr 
{
	String S="ABCddE";
	public void oper()
	{
		int i=3;
		int j=++i;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(S.toLowerCase());
	}

	public static void main(String[] args)
	{
		
		
		int i=3;
		int j=i++;
		
		System.out.println(i);
		System.out.println(j);
		
		Pr p=new Pr();
		p.oper();
		

	}

}
