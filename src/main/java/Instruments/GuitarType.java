package Instruments;

public enum GuitarType {

    ACOUSTIC(6),
    ELECTRIC6(6),
    ELECTRIC7(7),
    BASS4(4),
    BASS5(5);

    private final int numberOfStrings;

    GuitarType(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    int getNumberOfStrings(){
        return this.numberOfStrings;
    }


}
