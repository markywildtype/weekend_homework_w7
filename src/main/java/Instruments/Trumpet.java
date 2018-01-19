package Instruments;

import Interfaces.IPlayable;

public class Trumpet extends Instrument implements IPlayable{

    public Trumpet(InstrumentType instrumentType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
    }

    public String play() {
        return "Parp!";
    }
}
