package task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> products = new ArrayList<Product>();

    public Product getProductByName(String name) {
        for (Product product: products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(int cost) {
        for(Product product : products){
            if(product.getCost() == cost){
                return product;
            }
        }
        return null;
    }
    public void addProduct(String name, int cost){
        Product Pruduct = new Product(name, cost);
        products.add(Pruduct);
    }
}
