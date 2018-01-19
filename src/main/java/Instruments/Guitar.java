package Instruments;

import Interfaces.IColour;
import Interfaces.IPlayable;

public class Guitar extends Instrument implements IColour, IPlayable{

    private String colour;
    private GuitarType guitarType;

    public Guitar(InstrumentType instrumentType, GuitarType guitarType, String brand, String colour, double buyPrice, double sellPrice){
        super(instrumentType, brand, buyPrice, sellPrice);
        this.colour = colour;
        this.guitarType = guitarType;
    }

    public String getColour(){
        return this.colour;
    }

    public GuitarType getGuitarType(){
        return this.guitarType;
    }

    public String play(){
        return "Brrringgg!";
    }

    public int getNumberOfStrings() {
        return guitarType.getNumberOfStrings();
    }

//    public double calculateMarkup(){
//        double markUp = getSellPrice() - getBuyPrice();
//        return markUp;
//    }
}
