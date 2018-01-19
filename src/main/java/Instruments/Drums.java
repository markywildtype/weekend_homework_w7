package Instruments;

import Interfaces.IPlayable;

public class Drums extends Instrument implements IPlayable{
    public Drums(InstrumentType instrumentType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
    }

    public String play() {
        return "Bang bang bang bang!";
    }
}
