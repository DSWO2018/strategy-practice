import discos.calibradores.CalibradorCD;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalibradorCDTest {
    CalibradorCD c;

    @Before
    public void setUp(){
        c = new CalibradorCD();
    }

    @Test
    public void calibrate(){
        assertEquals("CD calibrado\n",c.calibrate());
    }
}
