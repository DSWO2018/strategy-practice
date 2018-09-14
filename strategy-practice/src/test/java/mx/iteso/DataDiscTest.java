package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alan on 9/14/18.
 */
public class DataDiscTest {
    Disc disc;
    @Before
    public void setUp(){
        disc = new DataDisc();
    }

    @Test
    public void calibrate(){
        assertEquals("Calibrando DataDisc",disc.calibrate());
    }
}
