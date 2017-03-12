/**
 * Created by Lasanga Madushan on 3/10/2017.
 */
public class Shop {
    private String name;
    private int id;
    private Item[] items;
    private Database database;
    Shop(String name, int id){
        this.name=name;
        this.id=id;
    }
    public void addItem(Item item){

    }
    public int getId(){return id;}
}
