package class1;

public class CallByValue1 {
	 
    public static int i = 0;
 
    CallByValue1()
    {
        i++;
    }
 
    public static int get()
    {
        return i;
    }
 
    public int m1()
    {
        System.out.println("Inside the method m1 by object of GFG class");
        this.m2();
        return 1;
    }
 
    public void m2()
    {
 
        System.out.println("In method m2 came from method m1");
    }
 
 
    public static void main(String[] args)
    {
        
    	CallByValue1 obj = new CallByValue1();
 
        int i = obj.m1();
 
        System.out.println("Control returned after method m1 :" + i);
 
        int no_of_objects = CallByValue1.get();
 
        System.out.print("No of instances created till now : ");
       
        System.out.println(no_of_objects);
    }
}
