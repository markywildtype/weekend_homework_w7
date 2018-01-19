package Instruments;

import Interfaces.IPlayable;

public class Drums extends Instrument implements IPlayable{

    DrumType drumType;

    public Drums(InstrumentType instrumentType, DrumType drumType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
        this.drumType = drumType;
    }

    public String play() {
        return "Bang bang bang bang!";
    }

    public DrumType getDrumType() {
        return this.drumType;
    }
}
