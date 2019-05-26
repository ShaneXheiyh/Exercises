package shoptest;

import OOPclass.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class StoreTest {

    @Test
    public void testGetAllProducts(){
        //setup
        Cabbage cabbage = new Cabbage(7.2);
        Tomato tomato = new Tomato(5);
        CleaningProduct cleaningProduct = new CleaningProduct("Brush",3);
        CleaningProduct cleaningProduct1 = new CleaningProduct("fairy",3);

        LinkedList<Vegetable> vegetables = new LinkedList<>();
        vegetables.add(cabbage);
        vegetables.add(tomato);

        LinkedList<CleaningProduct> cleaningProducts = new LinkedList<>();
        cleaningProducts.add(cleaningProduct);

        Store store = new Store(vegetables,cleaningProducts);

        //action
        LinkedList<Product> products = store.getAllProducts();

        //expectations
        Assert.assertEquals(3,products.size());
        Assert.assertTrue(products.contains(cabbage));
        Assert.assertTrue(products.contains(tomato));
        Assert.assertTrue(products.contains(cleaningProduct));
        Assert.assertFalse(products.contains(cleaningProduct1));

    }


}
