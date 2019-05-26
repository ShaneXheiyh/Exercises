package OOPclass;

import java.util.LinkedList;

public class Store {
    private LinkedList<Vegetable> vegetables;
    private LinkedList<CleaningProduct> cleaningProducts;

    public Store(LinkedList<Vegetable> vegetables, LinkedList<CleaningProduct> cleaningProducts){
        this.vegetables = vegetables;
        this.cleaningProducts = cleaningProducts;
    }

    public LinkedList<Product> getAllProducts(){
        LinkedList<Product> products = new LinkedList<Product>();
        products.addAll(vegetables);
        products.addAll(cleaningProducts);
        return products;
    }

}

