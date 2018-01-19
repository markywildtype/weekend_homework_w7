package Instruments;

public abstract class Instrument {

    private InstrumentType instrumentType;

    public Instrument(InstrumentType instrumentType){
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
