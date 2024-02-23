import java.util.*;

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

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void checkout() {
        double total = 0;
        System.out.println("Items in your cart:");
        for (Product item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
        System.out.println("Thank you for shopping with us!");
        items.clear();
    }
}

public class ECommerceSite {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product headphones = new Product("Headphones", 49.99);
        Product phoneCase = new Product("Phone Case", 9.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(headphones);
        cart.addItem(phoneCase);

        cart.checkout();
    }
}

