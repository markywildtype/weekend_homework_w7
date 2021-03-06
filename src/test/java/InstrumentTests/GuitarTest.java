package InstrumentTests;

import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRINGED, GuitarType.ELECTRIC6,"Hagstrom", "Satin Black", 300.00, 380.99);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRINGED, guitar.getInstrumentType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Hagstrom", guitar.getBrand());
    }

    @Test
    public void hasColour(){
        assertEquals("Satin Black", guitar.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(300.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(380.99, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.ELECTRIC6, guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Brrringgg!", guitar.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(80.99, guitar.calculateMarkup(), 0.01);
    }
}
