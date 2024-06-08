import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<Product> products;
    private double total;

    public Order() {
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
        }
        System.out.println("Total: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Product product1 = new Product("Phone", 15000.0);
        Product product2 = new Product("Laptop", 50000.0);

        order.addProduct(product1);
        order.addProduct(product2);

        order.displayOrder();
    }
}