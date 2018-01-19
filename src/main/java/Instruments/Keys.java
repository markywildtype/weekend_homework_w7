package Instruments;

import Interfaces.IPlayable;

public class Keys extends Instrument implements IPlayable{

    private KeysType keysType;
    private int numberOfOctaves;

   public Keys(InstrumentType instrumentType, KeysType keysType, int numberOfOctaves, String brand, double buyPrice, double sellPrice){
       super(instrumentType, brand, buyPrice, sellPrice);
       this.keysType = keysType;
       this.numberOfOctaves = numberOfOctaves;
   }

    public String play() {
        return "Plinky plonk!";
    }

    public KeysType getKeysType() {
        return this.keysType;
    }

    public int getNumberOfOctaves() {
        return this.numberOfOctaves;
    }
}
