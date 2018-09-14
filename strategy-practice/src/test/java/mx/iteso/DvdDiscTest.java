package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alan on 9/14/18.
 */
public class DvdDiscTest {
    Disc disc;
    @Before
    public void setUp(){
        disc = new DvdDisc();
    }
    @Test
    public void calibrate(){
        assertEquals("Calibrando DvdDisc",disc.calibrate());
    }

}
