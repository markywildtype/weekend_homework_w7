package AccesoriesTests;

import Accessories.AccessoryType;
import Accessories.InstrumentAccessory;
import Accessories.InstrumentAccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentAccessoryTest {

    InstrumentAccessory instrumentAccessory;

    @Before
    public void before(){
        instrumentAccessory = new InstrumentAccessory(AccessoryType.INSTRUMENTACCESSORY, InstrumentAccessoryType.CABLES, 5.50, 8.99);
    }

    @Test
    public void hasAccessoryType(){
        assertEquals(AccessoryType.INSTRUMENTACCESSORY, instrumentAccessory.getAccessoryType());
    }

    @Test
    public void hasInstrumentAccessoryType(){
        assertEquals(InstrumentAccessoryType.CABLES, instrumentAccessory.getInstrumentAccessoryType());
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
