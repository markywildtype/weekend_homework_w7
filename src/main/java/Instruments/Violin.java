package Instruments;

import Interfaces.IPlayable;

public class Violin extends Instrument implements IPlayable {

    public Violin(InstrumentType instrumentType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Screeeeee!";
    }
}
