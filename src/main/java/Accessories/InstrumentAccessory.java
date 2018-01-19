package Accessories;

public class InstrumentAccessory extends Accessory {

    private InstrumentAccessoryType instrumentAccessoryType;

    public InstrumentAccessory(InstrumentAccessoryType instrumentAccessoryType, String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
        this.instrumentAccessoryType = instrumentAccessoryType;
    }

    public InstrumentAccessoryType getInstrumentAccessoryType() {
        return this.instrumentAccessoryType;
    }
}
