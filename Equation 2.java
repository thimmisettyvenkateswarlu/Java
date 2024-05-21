import java.io.*;
public class QuadraticEquations {

    
  public static void main(String[] Strings) 
  {
  	int a=1;
  	int b=5;
  	int c=1;

            double d = b * b - 4.0 * a * c;

            if (d > 0.0) 
            {
                double r1 = (-b + Math.pow(d,0.5)) / (2.0 * a);
                
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                
                System.out.println("The roots are " + r1 + " and " + r2);
                
            } 
            else if (d == 0.0)
             {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } 
            else 
            {
                System.out.println("The equation has no real roots.");
            }

    }
}
