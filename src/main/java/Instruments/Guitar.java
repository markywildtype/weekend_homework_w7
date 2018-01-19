package Instruments;

import Interfaces.IColour;

public class Guitar extends Instrument implements IColour {

    private String colour;

    public Guitar(InstrumentType instrumentType, String brand, String colour, double buyPrice, double sellPrice){
        super(instrumentType, brand, buyPrice, sellPrice);
        this.colour = colour;
    }

    public String getColour(){
        return this.colour;
    }

}
