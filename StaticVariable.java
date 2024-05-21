import java.io.*;
public class StaticVariable
 {
 	//global variable
 	static int a =15;
	public static void main(String[] args)
	 {
		System.out.println(a);
		//local variable
		 int b=20;
		 System.out.println(b);
	}
	public static void test1()
	{
	 System.out.println(a);
	 
	 //error we can not access local variable in the test1 method
	 
	 //System.out.println(b);
	}
  }