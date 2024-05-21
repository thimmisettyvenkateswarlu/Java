public class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void bark() {
    System.out.println("Woof");
  }

  public void displayInfo() 
  {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
    // Create a new Dog object
    Dog myDog = new Dog("Buddy", 3);

    // Call methods on the object
    myDog.bark();
    myDog.displayInfo();
  }
}