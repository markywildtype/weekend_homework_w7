package AccessoriesTests;

import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Chord book", "KT Tunstall: Eye To The Telescope", 83, 4.51, 6.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Chord book", sheetMusic.getDescription());
    }

    @Test
    public void hasTitle(){
        assertEquals("KT Tunstall: Eye To The Telescope", sheetMusic.getTitle());
    }

    @Test
    public void hasPages(){
        assertEquals(83, sheetMusic.getPages());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(4.51, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(6.99, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(2.48, sheetMusic.calculateMarkup(), 0.01);
    }
}
