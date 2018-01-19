import Interfaces.ISellable;

public abstract class Items implements ISellable{

    private double buyPrice;
    private double sellPrice;

    public Items(double buyPrice, double sellPrice){
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
