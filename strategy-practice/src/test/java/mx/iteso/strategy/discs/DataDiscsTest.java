package mx.iteso.strategy.discs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DataDiscsTest {
    @Test
    public void testDataDisc(){
        DataDiscs dd = new DataDiscs();
        assertEquals("Calibrating with Data Discs", dd.cal.play());
    }

}