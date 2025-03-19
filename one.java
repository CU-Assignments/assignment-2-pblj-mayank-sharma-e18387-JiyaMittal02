class Product {
    private int id;
    private String name;
    private double price;

    // Constructor to initialize product attributes
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Creating a product object
        Product product = new Product(101, "Laptop", 75000);
        
        // Display product details
        product.displayProduct();
    }
}
