package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(InstrumentType.BRASS, "Etude", 160.00, 209.99);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Etude", trumpet.getBrand());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(160.00, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(209.99, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(49.99, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Parp!", trumpet.play());
    }

}
