package OOPclass;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier {
    LinkedList<Client> queue;


    public Cashier(){
        this.queue = new LinkedList<>();
    }

    public void addClientInQueue(Client client){
        queue.add(client);
    }

    public Client getNextClient(){
        return queue.remove();
    }

    public double getNextClientTotalPrice(){
        ShoppingCart shoppingCart = getNextClient().getShoppingCart();

        double totalPrice = 0;
        for(Product product : shoppingCart.getProducts()){
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }

//    public double getTotal(ShoppingCart shoppingCart) {
//
//        double totalPrice = 0;
//        LinkedList<Product> products = shoppingCart.getProducts();
//        for (int i = 0; i < products.size(); i++) {
//            totalPrice += products.get(i).getPrice();
//        }
//        return totalPrice;
//    }

}
