import discos.BlueRayDisc;
import discos.DataDisc;
import discos.calibradores.CalibradorBlueRay;
import discos.calibradores.CalibradorCD;
import discos.calibradores.CalibradorDVD;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

public class DataDiscTest {
    DataDisc d;
    CalibradorBlueRay br;
    CalibradorCD cd;
    CalibradorDVD dvd;

    @Before
    public void setUp(){
        d = new DataDisc();
        br = mock(CalibradorBlueRay.class);
        cd = mock(CalibradorCD.class);
        dvd = mock(CalibradorDVD.class);
    }

    @Test
    public void runNoCalibration() {
        assertEquals("Primero específica el tipo de disco",d.run());
    }
    @Test
    public void runBlueRayData(){
        d.setCalibrador(br);
        when(br.calibrate()).thenReturn("Blue Ray calibrado\n");
        assertEquals("Blue Ray calibrado\nAquí están tus datos:",d.run());
    }

    @Test
    public void runCDData(){
        d.setCalibrador(br);
        when(br.calibrate()).thenReturn("CD calibrado\n");
        assertEquals("CD calibrado\nAquí están tus datos:",d.run());
    }

    @Test
    public void runDVDData(){
        d.setCalibrador(dvd);
        when(dvd.calibrate()).thenReturn("DVD calibrado\n");
        assertEquals("DVD calibrado\nAquí están tus datos:",d.run());
    }
}
