import discos.calibradores.CalibradorBlueRay;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalibradorBlueRayTest {
    CalibradorBlueRay c;

    @Before
    public void setUp(){
        c = new CalibradorBlueRay();
    }

    @Test
    public void calibrate(){
        assertEquals("Blue Ray calibrado\n",c.calibrate());
    }
}
