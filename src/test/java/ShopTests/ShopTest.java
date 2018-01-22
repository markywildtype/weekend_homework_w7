package ShopTests;

import Accessories.InstrumentAccessory;
import Accessories.InstrumentAccessoryType;
import Instruments.*;
import Interfaces.ISellable;
import org.junit.Before;
import org.junit.Test;
import Shop.Shop;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument;
    Instrument instrument2;
    Instrument trumpet;
    Instrument violin;

    InstrumentAccessory instrumentAccessory;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        instrument = new Guitar(InstrumentType.STRINGED, GuitarType.ELECTRIC6,"Hagstrom", "Satin Black", 300.00, 380.99);
        instrument2 = new Guitar(InstrumentType.STRINGED, GuitarType.ELECTRIC6,"Gibson", "Sunburst", 600.00, 750.99);
        trumpet = new Trumpet(InstrumentType.BRASS, TrumpetType.Bb, "Etude", 160.00, 209.99);
        violin = new Violin(InstrumentType.STRINGED, "Stentor", 90.00, 135.85);
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

    @Test
    public void canCanCalculateMarkupForAllStock(){
        shop.addToInventory(instrument);
        shop.addToInventory(instrumentAccessory);
        assertEquals(84.48, shop.calculatePotentialProfit(), 0.01);
    }

    @Test
    public void canReturnInventory(){
        shop.addToInventory(instrument);
        shop.addToInventory(instrumentAccessory);
        ArrayList<ISellable> inventory = shop.getInventory();
        assertEquals(2, inventory.size());
    }

//    @Test
//    public void canCountInventoryItems(){
//        shop.addToInventory(instrument);
//        shop.addToInventory(instrument2);
//        shop.addToInventory(trumpet);
//        shop.addToInventory(violin);
//        shop.addToInventory(instrumentAccessory);
//        HashMap<String, Integer> list = shop.listInventory();
//        assertEquals(2, list.get("Guitar"));
//    }
}
