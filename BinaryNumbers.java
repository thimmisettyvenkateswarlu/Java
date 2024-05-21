import java.io.*;

public class BinaryNumbers 
{
 public static void main(String[] args) {
  // Declare variables to store two binary numbers, an index, and a remainder
  long b1=10;
  long b2=11;
  int i = 0;
  int remainder= 0;
  
  // Create an array to store the sum of binary digits
  int[] sum = new int[20];
  
  while (b1 != 0 || b2 != 0) 
  {
   // Calculate the sum of binary digits and update the remainder
   sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
   remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  
  // If there is a remaining carry, add it to the sum
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  
  // Decrement the index to prepare for printing
  --i;
  
  // Display the sum of the two binary numbers
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
  
  System.out.print("\n");  
 }
}
