// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details (to be overridden in derived classes)
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayBookDetails();
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayBookDetails();
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating Fiction and Non-Fiction books
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        // Displaying book details
        fictionBook.displayBookDetails();
        nonFictionBook.displayBookDetails();
    }
}
