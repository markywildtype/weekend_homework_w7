package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentType.STRINGED, "Stentor", 90.00, 135.85);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRINGED, violin.getInstrumentType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Stentor", violin.getBrand());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(90.00, violin.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(135.85, violin.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(45.85, violin.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Screeeeee!", violin.play());
    }
}
