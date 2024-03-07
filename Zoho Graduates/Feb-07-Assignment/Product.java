// Create a class Product and add appropriate instance variables with different datatypes and try printing them. Note: See declaration for System.out.println method for various datatypes

public class Product 
{
    short id = 101;
    String name = "Samsung M31";
    float price = 35000.00f;
    int quantity = 10;
    boolean haveOffer = true;
    char type = 'M';


    public static void main(String[] args) 
    {
        Product product = new Product();
        System.out.println(product.id);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.quantity);
        System.out.println(product.haveOffer);
    }
}

