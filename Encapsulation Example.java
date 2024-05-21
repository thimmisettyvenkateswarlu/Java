public class Employee {
    private String name;
   private  int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo()
     {
        System.out .println("print all employee details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

 class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Johnson", 25, 5000.0);
        employee.displayInfo();
    }
}
