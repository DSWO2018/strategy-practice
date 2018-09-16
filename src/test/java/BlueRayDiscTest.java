import discos.BlueRayDisc;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BlueRayDiscTest {
    BlueRayDisc d;

    @Before
    public void setUp(){
        d = new BlueRayDisc();
    }

    @Test
    public void run(){
        assertEquals("Blue Ray calibrado\nDisfruta de tu película",d.run());
    }
}
