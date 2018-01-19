package InstrumentTests;

import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRINGED);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRINGED, guitar.getInstrumentType());
    }
}
