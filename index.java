public class ArrayLength
{

public static void main(String[] args) {

int[] numbers = {1, 2, 3, 4, 5};

int key = 25;

for (int i = 0; i < numbers.length; i++) {

System.out.println("Element at index "

+ i + ":" + numbers[i]);

if(numbers[i] == key) {

System.out.println(i);

System.out.println("Key found");

} else {

System.out.println("No Key found");

}
}
}
}