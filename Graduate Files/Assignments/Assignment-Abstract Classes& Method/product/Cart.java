package product;

import java.util.List;
import java.util.ArrayList;

class Cart {
    private List<Product> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void displayCart() {
        System.out.println("Items in the cart:");
        for (Product product : cartItems) {
            System.out.println(product.getDescription() + " - " + product.getPrice());
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }
}