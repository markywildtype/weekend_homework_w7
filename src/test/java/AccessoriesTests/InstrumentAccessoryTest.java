package AccessoriesTests;

import Accessories.InstrumentAccessory;
import Accessories.InstrumentAccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentAccessoryTest {

    InstrumentAccessory instrumentAccessory;

    @Before
    public void before(){
        instrumentAccessory = new InstrumentAccessory(InstrumentAccessoryType.CABLES, "Fender 10m Guitar Cable", 5.50, 8.99);
    }

    @Test
    public void hasInstrumentAccessoryType(){
        assertEquals(InstrumentAccessoryType.CABLES, instrumentAccessory.getInstrumentAccessoryType());
    }

    @Test
    public void hasDescription(){
        assertEquals("Fender 10m Guitar Cable", instrumentAccessory.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5.50, instrumentAccessory.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(8.99, instrumentAccessory.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(3.49, instrumentAccessory.calculateMarkup(), 0.01);
    }
}
