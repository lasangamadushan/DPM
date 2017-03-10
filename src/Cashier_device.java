/**
 * Created by Lasanga Madushan on 3/10/2017.
 */
public class Cashier_device {
    private String id;
    private double money;
    Cashier_device(String id) {
        this.id = id;
    }
    public void acceptCash(RFID_Card cd, Item item){
        if((double price=item.getPrice()) <=(double m=cd.getMoney())){
            cd.setMoney(m-price);
            Database.setMoney(money);
        }
    }
}
