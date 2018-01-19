package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Keys;
import Instruments.KeysType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeysTest {

    Keys keys;

    @Before
    public void before(){
        keys = new Keys(InstrumentType.KEYBOARD, KeysType.PIANO, "Yamaha", 160.00, 219.99);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, keys.getInstrumentType());
    }

    @Test
    public void hasKeysType(){
        assertEquals(KeysType.PIANO, keys.getKeysType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", keys.getBrand());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(160.00, keys.getBuyPrice(), 0.01);
    }

    @Test public void hasSellPrice(){
        assertEquals(219.99, keys.getSellPrice(), 0.01);
    }

    @Test public void hasMarkUp(){
        assertEquals(59.99, keys.calculateMarkup(), 0.01);
    }

}
