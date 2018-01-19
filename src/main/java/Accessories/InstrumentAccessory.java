package Accessories;

public class InstrumentAccessory extends Accessory {

    private InstrumentAccessoryType instrumentAccessoryType;

    public InstrumentAccessory(AccessoryType accessoryType, InstrumentAccessoryType instrumentAccessoryType, String description, double buyPrice, double sellPrice) {
        super(accessoryType, description, buyPrice, sellPrice);
        this.instrumentAccessoryType = instrumentAccessoryType;
    }

    public InstrumentAccessoryType getInstrumentAccessoryType() {
        return this.instrumentAccessoryType;
    }
}
