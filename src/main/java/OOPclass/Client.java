package OOPclass;

public class Client {

    private ShoppingCart shoppingCart;

    public Client(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public ShoppingCart getShoppingCart(){
        return this.shoppingCart;
    }
}
