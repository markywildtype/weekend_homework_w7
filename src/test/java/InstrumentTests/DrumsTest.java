package InstrumentTests;

import Instruments.DrumType;
import Instruments.Drums;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;


    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, DrumType.DRUMKIT,"Birch","Sonor", 400.00, 599.99);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void hasDrumType(){
        assertEquals(DrumType.DRUMKIT, drums.getDrumType());
    }

    @Test
    public void hasWoodType(){
        assertEquals("Birch", drums.getWoodType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Sonor", drums.getBrand());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400.00, drums.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(599.99, drums.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(199.99, drums.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Bang bang bang bang!", drums.play());
    }
}
