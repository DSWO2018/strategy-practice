package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Alan on 9/14/18.
 */
public class PlayStation4Test {
    PlayStation4 ps;
    Disc mockedDisc;
    @Before
    public void setUp(){
        ps = new PlayStation4();
        mockedDisc = mock(Disc.class);
        ps.setDisc(mockedDisc);
    }
    @Test
    public void setDisc(){
        when(mockedDisc.calibrate()).thenReturn("Calibrando MockedDisc");
        assertEquals("Calibrando MockedDisc",ps.play());
    }

}
