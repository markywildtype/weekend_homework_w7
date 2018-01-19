package ShopTests;

import org.junit.Before;
import org.junit.Test;
import Shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, shop.countInventory());
    }

//    @Test
//    public void canAddInstrumentToInventory(){
//        assertEquals(1, shop.countInventory());
//    }
}
