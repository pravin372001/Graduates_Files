package product;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 50000, "Dell");
        ClothingProduct shirt = new ClothingProduct("T-Shirt", 499, "L");
        BookProduct book = new BookProduct("Java Programming", 1099, "James Gousling");

        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(book);

        cart.displayCart();
        System.out.println("Total price: " + cart.calculateTotalPrice());
    }
}
