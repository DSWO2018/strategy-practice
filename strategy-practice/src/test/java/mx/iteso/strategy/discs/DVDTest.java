package mx.iteso.strategy.discs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DVDTest {
    @Test
    public void testDVD(){
        DVD dvd = new DVD();
        assertEquals("Calibrating with DVD", dvd.getCal().play());
    }

}