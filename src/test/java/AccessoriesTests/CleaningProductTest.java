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
}
