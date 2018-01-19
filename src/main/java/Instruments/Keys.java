package Instruments;

public class Keys extends Instrument {

    private KeysType keysType;

   public Keys(InstrumentType instrumentType, KeysType keysType, String brand, double buyPrice, double sellPrice){
       super(instrumentType, brand, buyPrice, sellPrice);
       this.keysType = keysType;
   }

    public String play() {
        return "Plinky plonk!";
    }

    public KeysType getKeysType() {
        return this.keysType;
    }
}
