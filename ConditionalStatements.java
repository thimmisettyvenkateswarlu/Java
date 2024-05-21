  import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("take any input value:");
		int i=scan.nextInt();
		if(i%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}