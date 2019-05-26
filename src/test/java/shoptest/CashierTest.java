package shoptest;

import OOPclass.*;
import org.junit.Assert;
import org.junit.Test;

public class CashierTest {
    @Test
    public void testGetNextClientTotalPrice(){
        //setup
        Cashier cashier = new Cashier();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Tomato(2));
        shoppingCart.addProduct(new CleaningProduct("Toothpaste", 5));
        shoppingCart.addProduct(new Cabbage(9));
        Client client = new Client(shoppingCart);
        cashier.addClientInQueue(client);

//        this is the action
        double price = cashier.getNextClientTotalPrice();

//        this is the expectation
        Assert.assertEquals(14.9, price, 0.01);

    }












//    @Test
//    public void testGivenAShoppingCart_ItReturnsTotalPrice(){
//        Cashier cashier = new Cashier();
//        ShoppingCart shoppingCart = new ShoppingCart();
//        Product testProduct1 = new Product("p1", 20.45);
//        Product testProduct2 = new Product("p2", 1.3);
//        Product testProduct3 = new Product("p3", 4.6);
//        Product testProduct4 = new Product("p4", 5.5);
//        Product testProduct5 = new Product("p5", 9.6);
//        shoppingCart.addProduct(testProduct1);
//        shoppingCart.addProduct(testProduct2);
//        shoppingCart.addProduct(testProduct3);
//        shoppingCart.addProduct(testProduct4);
//        shoppingCart.addProduct(testProduct5);
//
//        double actual = cashier.getTotal(shoppingCart);
//
//        Assert.assertEquals(41.45,actual, 0);
//    }

}
