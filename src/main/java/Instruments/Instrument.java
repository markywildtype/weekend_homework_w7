package Instruments;

import Interfaces.ISellable;

public abstract class Instrument implements ISellable{

    private InstrumentType instrumentType;
    private String brand;
    private double buyPrice;
    private double sellPrice;

    public Instrument(InstrumentType instrumentType, String brand, double buyPrice, double sellPrice){
        this.instrumentType = instrumentType;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getBrand() {
        return this.brand;
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
