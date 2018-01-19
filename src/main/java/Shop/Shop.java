package Shop;

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
}
