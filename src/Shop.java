/**
 * Created by Lasanga Madushan on 3/10/2017.
 */
public class Shop {

}
class Database{
    private double money;
    Database(){
        setMoney(0.0);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money += money;
    }
}
class Item{
    private String id;
    private double price;
    private static int quantity=0;
    Item(String id, double price){
        this.id= id;
        this.price=price;
        quantity++;
    }
}