package Shop;

import Instruments.Instrument;
import Interfaces.ISellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISellable> shopInventory;

    public Shop(String name){
        this.name = name;
        this.shopInventory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int countInventory() {
        return this.shopInventory.size();
    }

    public void addToInventory(ISellable sellableItem) {
        this.shopInventory.add(sellableItem);
    }

    public void clearInventory() {
        this.shopInventory.clear();
    }
}
