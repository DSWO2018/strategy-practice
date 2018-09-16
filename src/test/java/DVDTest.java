import discos.DVD;
import discos.MusicCD;
import discos.PlayStation4Disc;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DVDTest {
    DVD d;

    @Before
    public void setUp(){
        d = new DVD();
    }

    @Test
    public void run(){
        assertEquals("DVD calibrado\nDisfruta de tu DVD",d.run());
    }
}
