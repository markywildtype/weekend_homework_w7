package Accessories;

public class InstrumentAccessory extends Accessory {

    InstrumentAccessoryType instrumentAccessoryType;

    public InstrumentAccessory(AccessoryType accessoryType, InstrumentAccessoryType instrumentAccessoryType, double buyPrice, double sellPrice) {
        super(accessoryType, buyPrice, sellPrice);
        this.instrumentAccessoryType = instrumentAccessoryType;
    }

    public InstrumentAccessoryType getInstrumentAccessoryType() {
        return this.instrumentAccessoryType;
    }
}
