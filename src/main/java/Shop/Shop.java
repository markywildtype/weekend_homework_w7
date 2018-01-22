package Shop;

import Instruments.Instrument;
import Interfaces.ISellable;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private String name;
    private ArrayList<ISellable> shopInventory;

    public Shop(String name){
        this.name = name;
        this.shopInventory = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int countInventory(){
        return this.shopInventory.size();
    }

    public void addToInventory(ISellable sellableItem){
        this.shopInventory.add(sellableItem);
    }

    public void clearInventory(){
        this.shopInventory.clear();
    }

    public ISellable removeFromInventory(ISellable sellableItem){
        this.shopInventory.remove(sellableItem);
        return sellableItem;
    }

    public double calculatePotentialProfit(){
        double totalPotentialProfit = 0;
        for(ISellable item : shopInventory){
            double markup = item.calculateMarkup();
            totalPotentialProfit += markup;
        }
        return totalPotentialProfit;
    }

//    public HashMap<String, Integer> listInventory(){
//        HashMap<String, Integer> list = new HashMap<>();
//        for(ISellable item : shopInventory){
//            int counter = 0;
//            String itemType = item.getClass().toString();
//            if(!list.containsKey(itemType)){
//                list.put(itemType, 1);
//            } else {
//                counter += 1;
//                list.put(itemType, counter);
//            }
//        }
//        return list;
//    }

    public ArrayList<ISellable> getInventory() {
        return this.shopInventory;
    }
}
