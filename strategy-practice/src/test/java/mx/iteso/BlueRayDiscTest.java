package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Alan on 9/14/18.
 */
public class BlueRayDiscTest {
    Disc disc;
    @Before
    public void setUp() {
        disc = new BlueRayDisc();
    }
    @Test
    public void calibrate(){
        assertEquals("Calibrando BlueRayDisc",disc.calibrate());
    }
}
