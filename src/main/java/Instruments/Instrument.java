package Instruments;

import Interfaces.ISellable;
import Shop.SellableItem;

public abstract class Instrument extends SellableItem implements ISellable{

    private InstrumentType instrumentType;
    private String brand;

    public Instrument(InstrumentType instrumentType, String brand, double buyPrice, double sellPrice){
        super(buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.brand = brand;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getBrand(){
        return this.brand;
    }

}
