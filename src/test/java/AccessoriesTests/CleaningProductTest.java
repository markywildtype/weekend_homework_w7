package AccessoriesTests;

import Accessories.CleaningProduct;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CleaningProductTest {

    CleaningProduct cleaningProduct;

    @Before
    public void before(){
        cleaningProduct = new CleaningProduct("Jim Dunlop System 65", 20.00, 29.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Jim Dunlop System 65", cleaningProduct.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, cleaningProduct.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(29.99, cleaningProduct.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(9.99, cleaningProduct.calculateMarkup(), 0.01);
    }
}
