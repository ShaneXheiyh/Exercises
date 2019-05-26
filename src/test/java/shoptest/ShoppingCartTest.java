package shoptest;

import OOPclass.Product;
import OOPclass.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class ShoppingCartTest {

    @Test
    public void testAddProduct() {
        Product testProduct = new Product("tea", 20.45);
        ShoppingCart testShoppingCart = new ShoppingCart();

        testShoppingCart.addProduct(testProduct);

        LinkedList<Product> allProductsinCart = testShoppingCart.getProducts();
        Product actualProduct = allProductsinCart.get(0);
        Assert.assertEquals("tea", actualProduct.getName());
        Assert.assertEquals(20.45, actualProduct.getPrice(), 0);
    }

    @Test
    public void testGivenAProduct_itContainsTheProduct(){
        Product testProduct1 = new Product("milk",3.69);
        Product testProduct2 = new Product("coffee",9.56);
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addProduct(testProduct1);
        testShoppingCart.addProduct(testProduct2);

        boolean actual = testShoppingCart.contains(testProduct1);
        boolean actual2 = testShoppingCart.contains(testProduct2);

        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
    }

}
