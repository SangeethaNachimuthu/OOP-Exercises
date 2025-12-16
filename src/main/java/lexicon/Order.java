package lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList;

    public Order() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    //This method will add the product to the List.
    public void addProduct(Product p) {
        productList.add(p);
    }

    //This method will remove the product from the List.
    public void removeProduct(Product p) {
        productList.remove(p);
    }

    /*
    This method used to calculate the total price of the order.
     */
    public void calculateTotal() {
        double total = 0;

        for (Product product : productList) {
            total = total + product.getPrice();
        }
        System.out.println("The total price is: " + total);
    }

    @Override
    public String toString() {
        return "Ordered products are: " + productList ;
    }

}
