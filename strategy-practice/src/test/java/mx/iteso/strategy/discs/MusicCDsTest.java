package mx.iteso.strategy.discs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MusicCDsTest {
    @Test
    public void testMuiscCDs(){
        MusicCDs mcd = new MusicCDs();
        assertEquals("Calibrating with Music CD's", mcd.getCal().play());
    }

}