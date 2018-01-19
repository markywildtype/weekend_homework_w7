package AccessoriesTests;

import Accessories.Other;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherTest {

    Other other;

    @Before
    public void before(){
        other = new Other("Footrest", 9.30, 15.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Footrest", other.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(9.30, other.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15.99, other.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(6.69, other.calculateMarkup(), 0.01);
    }
}
