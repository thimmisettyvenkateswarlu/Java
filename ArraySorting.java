import java.util.Arrays;
public class JavaExample {

  public static void main(String a[]){
    String[] names = new String[]{"Chaitanya", "Steve", "Rob", "Ajeet"};

    //print array before sorting
    System.out.println("Array before sorting: ");
    for (String str: names)
    {
      System.out.print(str+ " ");
    }

    //sorting array
    Arrays.sort(names);

    //new line
    System.out.println();

    //print array after sorting
    System.out.println("Array after sorting: ");
    for (String str: names)
    {
      System.out.print(str+ " ");
    }
  }
}