class Product {
    int proid;
    String proname;
    double price;

    // Constructor
    Product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product ID: " + proid);
        System.out.println("Product Name: " + proname);
        System.out.println("Product Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating 5 product objects
        Product p1 = new Product(1, "Laptop", 999.99);
        Product p2 = new Product(2, "Smartphone", 699.99);
        Product p3 = new Product(3, "Tablet", 399.99);
        Product p4 = new Product(4, "Smartwatch", 199.99);
        Product p5 = new Product(5, "Headphones", 149.99);

        // Displaying product details
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}
