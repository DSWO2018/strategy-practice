import discos.MusicCD;
import discos.PlayStation4Disc;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MusicCDTest {
    MusicCD d;

    @Before
    public void setUp(){
        d = new MusicCD();
    }

    @Test
    public void run(){
        assertEquals("CD calibrado\nDisfruta de tu música",d.run());
    }
}
