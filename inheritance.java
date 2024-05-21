// Parent class (superclass)
public class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void sound() {
    System.out.println("The animal makes a sound");
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
  }
}

// Child class (subclass)
 class Dog extends Animal {
  private int age;

  public Dog(String name, int age) {
    super(name); // Call parent class constructor
    this.age = age;
  }

  @Override
  public void sound() {
    System.out.println("The dog barks");
  }

  public void displayInfo() {
    super.displayInfo(); // Call parent class method
    System.out.println("Age: " + age);
  }
}

class Main {
  public static void main(String[] args) {
    // Create a new Dog object
    Dog myDog = new Dog("Max", 5);

    // Call methods on the object
    myDog.sound();
    myDog.displayInfo();
  }
}