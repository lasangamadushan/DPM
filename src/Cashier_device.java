import java.util.ArrayList;

/**
 * Created by Lasanga Madushan on 3/10/2017.
 */
public class Cashier_device {
    private int id;
    private Shop shop;
    private  int shopId;
    Cashier_device(int id, Shop shop) {
        this.id = id;
        this.shop=shop;
        shopId=shop.getId();
    }
    public void acceptCash(RFID_Card cd, Item item) throws Exception {
        try {
            int cdId = cd.getId();
            ArrayList<String> userDetails = Database.get(cdId, "mytable");
            ArrayList<String> shopDetails = Database.get(shopId, "shop");
            double shopMoney = Double.parseDouble(shopDetails.get(2));
            double userMoney = Double.parseDouble(userDetails.get(2));
            System.out.printf("Initial Balance Rs: %.2f \n", userMoney);
            double price = item.getPrice();

            if (price <= userMoney) {
                userMoney -= price;
                shopMoney += price;
                Database.updateMoney(cdId, (userMoney),"mytable");
                Database.updateMoney(shopId, (shopMoney),"shop");
                System.out.printf(userDetails.get(0) + " " + userDetails.get(1) + " have Rs: %.2f \n", userMoney);
            } else {
                System.out.println("You don't have enough money!");
            }
        }catch (Exception e){
            System.out.println("Cashier_device.acceptCash: "+e);
        }
    }
}
