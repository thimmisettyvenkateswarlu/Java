import java.io.*;
public class InstanceVariable
 {
 	int age=18;
	public static void main(String[] args)
	 {
	 	//create object 
	 	InstanceVariable student = new InstanceVariable();
	 	System.out.println("Student age is:" +student.age);
	}
}