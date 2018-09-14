package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alan on 9/13/18.
 */
public class MusicDiscTest {
    Disc disc;
    @Before
    public void setUp(){
        disc = new MusicDisc();
    }
    @Test
    public void calibate(){
        assertEquals("Calibrando MusicDisc",disc.calibrate());
    }
}
