package ShopTests;

import Accessories.InstrumentAccessory;
import Accessories.InstrumentAccessoryType;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.Instrument;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import Shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument;
    InstrumentAccessory instrumentAccessory;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        instrument = new Guitar(InstrumentType.STRINGED, GuitarType.ELECTRIC6,"Hagstrom", "Satin Black", 300.00, 380.99);
        instrumentAccessory = new InstrumentAccessory(InstrumentAccessoryType.CABLES, "Fender 10m Guitar Cable", 5.50, 8.99);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, shop.countInventory());
    }

    @Test
    public void canAddInstrumentToInventory(){
        shop.addToInventory(instrument);
        assertEquals(1, shop.countInventory());
    }

    @Test
    public void canAddAccessoryToInventory(){
        shop.addToInventory(instrumentAccessory);
        assertEquals(1, shop.countInventory());
    }

    @Test
    public void canAddInstrumentAndAccessoryToInventory(){
        shop.addToInventory(instrument);
        shop.addToInventory(instrumentAccessory);
        assertEquals(2, shop.countInventory());
    }

    @Test
    public void canClearInventory(){
        shop.addToInventory(instrument);
        shop.clearInventory();
        assertEquals(0, shop.countInventory());
    }

    @Test
    public void canRemoveInstrumentFromInventory(){
        shop.addToInventory(instrument);
        shop.addToInventory(instrumentAccessory);
        assertEquals(instrument, shop.removeFromInventory(instrument));
        assertEquals(1, shop.countInventory());
    }

    @Test
    public void canRemoveAccessoryFromInventory(){
        shop.addToInventory(instrument);
        shop.addToInventory(instrumentAccessory);
        assertEquals(instrumentAccessory, shop.removeFromInventory(instrumentAccessory));
        assertEquals(1, shop.countInventory());
    }
}
