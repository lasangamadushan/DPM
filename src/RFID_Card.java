/**
 * Created by Lasanga Madushan on 3/10/2017.
 */
public class RFID_Card {
    private String id;
    private double money;
    RFID_Card(String id){
        this.id=id;
        setMoney(0.0);
    }

    public String getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
