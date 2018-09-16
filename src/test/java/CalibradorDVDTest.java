import discos.calibradores.CalibradorDVD;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalibradorDVDTest {
    CalibradorDVD dvd;

    @Before
    public void setUp(){
        dvd = new CalibradorDVD();
    }

    @Test
    public void calibrate(){
        assertEquals("DVD calibrado\n",dvd.calibrate());
    }
}
