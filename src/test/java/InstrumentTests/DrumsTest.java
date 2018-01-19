package InstrumentTests;

import Instruments.Drums;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, "Sonor", 400.00, 599.99);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("Bang bang bang bang!", drums.play());
    }
}
