package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alan on 9/14/18.
 */
public class Ps4GameDiscTest {
    Disc disc;
    @Before
    public void setUp(){
        disc = new Ps4GameDisc();
    }

    @Test
    public void calibrate(){
        assertEquals("Calibrando Ps4GameDisc",disc.calibrate());
    }
}
