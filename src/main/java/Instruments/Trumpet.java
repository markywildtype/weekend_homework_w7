package Instruments;

import Interfaces.IPlayable;

public class Trumpet extends Instrument implements IPlayable{

    private TrumpetType trumpetType;
    private int numberOfValves;

    public Trumpet(InstrumentType instrumentType, TrumpetType trumpetType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
        this.trumpetType = trumpetType;
        this.numberOfValves = 3;
    }

    public String play() {
        return "Parp!";
    }

    public TrumpetType getTrumpetType() {
        return this.trumpetType;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }
}
