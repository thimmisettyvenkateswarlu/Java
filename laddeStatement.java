import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("take user input value:");
		int i=scan.nextInt();
		if(i>550)
		{
			System.out.println("first class distinction");
		} 
		else if(i>500)
		{
			System.out.println("second class distinction");
		}
		else if(i>400)
		{
			System.out.println("third class distinction");
		}
		else if (i>200)
		{
			System.out.println("boader pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}