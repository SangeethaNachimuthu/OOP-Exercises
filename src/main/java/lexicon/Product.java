package lexicon;

/*
The Product class holds the fields of productId, Name and Price.
 */
public class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.setProductId(productId);
        this.setName(name);
        this.setPrice(price);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId < 0) {
            throw new IllegalArgumentException("Product Id can't be Negative!");
        }
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Product name is empty or null!");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be zero or negative!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return getProductId() + " " + getName() + " " + getPrice();
    }
}
