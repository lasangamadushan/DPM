/**
 * Created by Lasanga Madushan on 3/12/2017.
 */
public class Main {
    public static void main(String[] args) throws  Exception{
        RFID_Card rfid_card = new RFID_Card(1);
        Shop shop = new Shop("aShop", 1);
        Cashier_device cashier_device = new Cashier_device(141,shop);
        Item item = new Item(5, 2.0);


        cashier_device.acceptCash(rfid_card, item);

    }
}
