package product;

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return name + " - Size: " + size;
    }
}