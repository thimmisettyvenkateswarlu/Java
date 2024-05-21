   import java.io.*;
       public class Break{
    public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Day:1-Monday");
        break;
      case 2:
        System.out.println(" Day:2-Tuesday");
        break;
      case 3:
        System.out.println("Day:3- Wednesday");
        break;
      case 4:
        System.out.println("Day:4-Thursday");
        break;
      case 5:
        System.out.println("Day:5-Friday");
        break;
      case 6:
        System.out.println("Day:6-Saturday");
        break;
      case 7:
      default:
      System.out.println("invaild");
       }
    }
   }