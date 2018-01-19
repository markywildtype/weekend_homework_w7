package Shop;

import Interfaces.ISellable;

public abstract class SellableItem implements ISellable{

    private double buyPrice;
    private double sellPrice;

    public SellableItem(double buyPrice, double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkup(){
        double markUp = getSellPrice() - getBuyPrice();
        return markUp;
    }
}
