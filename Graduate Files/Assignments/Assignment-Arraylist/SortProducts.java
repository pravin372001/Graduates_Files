import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        return this.productId - other.productId;
    }
}

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getProductPrice(), p2.getProductPrice());
    }
}

class ProductIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getProductId(), p2.getProductId());
    }
}

public class SortProducts {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.0));
        products.add(new Product(2, "Smartphone", 800.0));
        products.add(new Product(3, "Headphones", 100.0));
        products.add(new Product(4, "Tablet", 600.0));

        System.out.println("Products before sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        Collections.sort(products, new ProductPriceComparator());

        System.out.println("\nProducts after sorting based on product price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
