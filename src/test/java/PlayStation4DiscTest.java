import discos.Disco;
import discos.PlayStation4Disc;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlayStation4DiscTest {
    PlayStation4Disc d;

    @Before
    public void setUp(){
        d = new PlayStation4Disc();
    }

    @Test
    public void run(){
        assertEquals("Blue Ray calibrado\nDisfruta de tu juego",d.run());
    }

}
