package OOPclass;

public class Vegetable extends Product {
    private double discount;

    public Vegetable(String name, double price) {
        super(name,price);
        this.discount = 10;
    }

    public double getPrice() {

        return this.price - this.discount/100*this.price;
    }

}
