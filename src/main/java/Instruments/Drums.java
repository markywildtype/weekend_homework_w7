package Instruments;

import Interfaces.IPlayable;

public class Drums extends Instrument implements IPlayable{

    private DrumType drumType;
    private String woodType;

    public Drums(InstrumentType instrumentType, DrumType drumType, String woodType, String brand, double buyPrice, double sellPrice) {
        super(instrumentType, brand, buyPrice, sellPrice);
        this.drumType = drumType;
        this.woodType = woodType;
    }

    public String play() {
        return "Bang bang bang bang!";
    }

    public DrumType getDrumType() {
        return this.drumType;
    }

    public String getWoodType() {
        return this.woodType;
    }
}
