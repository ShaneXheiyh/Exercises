package OOPclass;

import java.util.LinkedList;

public class ShoppingCart {

    private LinkedList<Product> products;

    public ShoppingCart(){
        this.products = new LinkedList<>();
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public LinkedList<Product> getProducts() {
        return this.products;
    }

    public boolean contains(Product product) {
        for (int i = 0; i < this.products.size(); i++) {
            Product element = this.products.get(i);
            if (element != null && element.getName() == product.getName() && element.getPrice() == product.getPrice()){
                return true;
            }
        }
        return false;
    }
}
