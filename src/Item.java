/**
 * Created by Lasanga Madushan on 3/12/2017.
 */
public class Item{
    private int id;
    private double price;
    private static int quantity=0;
    Item(int id, double price){
        this.id= id;
        this.setPrice(price);
        setQuantity(getQuantity() + 1);
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Item.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
