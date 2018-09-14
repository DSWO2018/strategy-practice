package mx.iteso.strategy.discs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlurayTest {

    @Test
    public void testBluray(){
        Bluray bluray = new Bluray();
        assertEquals("Calibrating with Bluray", bluray.getCal().play());
    }

}
