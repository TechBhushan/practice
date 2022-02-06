package class1;

public class StringDemo {

	public static void main(String[] args)
	{
		
		/*
		//lenght()
		System.out.println("Length of string is: "+s1.length());
		
		//toUpperCase()  & toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//startsWith("prefix")
		System.out.println("Is my string starts with Selenium??: "+s1.startsWith("Sel"));
		
		//endsWith("suffix")
		System.out.println("Is my string ends with tool?: "+s1.endsWith("ol"));
		*/
		String s1="Selenium is WebUI Automation Tool";
		String s2="Selenium is WebUI Automation tool";
		
		//String methods Checks equality based on string contents.
		//1.equals(): case sensitive       2.equalsIgnoreCase()
		System.out.println("String equality using equals(): "+s1.equals(s2));
		System.out.println("String equality using equalIgnoreCase(): "+s1.equalsIgnoreCase(s2));
		
		//Operator checks equality based on id allocated by jvm
		System.out.println(s1==s2);
		
		//trim():ignore white space
		String s3="     Welcome      ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		
		//charAt(index)
		String s4="Hello";
		System.out.println("character at index 4: "+s4.charAt(4));
		
		//Concat()
		System.out.println(s4.concat(" "+s1));
		
		//split()
		String tools="HpQTP Selenium TestNG Maven Jenkins";
		
		String arr[]=tools.split(" ");
		for(String i:arr)
		{
			System.out.println(i);
		}
		//String ---->Immutable
		
		//StringBuilder/StringBuffer---->Mutable
		StringBuilder builder=new StringBuilder("Hello");
		builder.reverse();
		System.out.println(builder);
		
		//reverse String
		String actual="Java Selenium";
		String rev="";
		
		for(int i=actual.length()-1;i>=0;i--)
		{
			rev=rev+actual.charAt(i);
		}
		
		System.out.println("Reverse of String "+actual+" is:"+rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
