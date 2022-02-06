package class1;

public class StringClassDemo {

	public static void main(String[] args)
	{
		
		String s1="Java is write once,use anywhere language";
		
		//length()
		System.out.println(s1.length());
		
		//uppercase() and lowercase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//startWith("prefix")
		System.out.println("Is my string starts with 'Ja': "+s1.startsWith("Ja"));
		
		//endsWith("suffix")
		System.out.println("Is ny string ends with 'language': "+s1.endsWith("language"));
		
		
		//equals methods checks equality based on the string contents
		//equals()  :case sensitive			//equalsIgnoreCase()  :not case sensitive
		String s2="Java is Write once, Use anywhere language";
		System.out.println("Are my strings equal: "+s1.equals(s2));
		
		System.out.println("Are my strings equal: "+s1.equalsIgnoreCase(s2));
		
		//Operator checks equality based on the id allocated by JVM
		System.out.println(s1==s2);
		
		//trim()   :ignore white spaces
		String s3="     Welcome     ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		//concat()   :concatinate the strings
		String s4="Hi";
		System.out.println(s4.concat(" "+s1));
		
		//charAt(index)
		System.out.println(s1.charAt(5));
		
		//split()  :split the string into array
		String ar[]=s1.split(",");
		
		for(String x:ar)
		{
			System.out.println(x);
		}
		
		//StringBuilder  :mutable
		
		StringBuilder sb=new StringBuilder("Hello");
		
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
		

	}

}
