package mx.iteso.strategy.discs;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PS4GamesTest {
    @Test
    public void testPS4Games(){
        PS4Games psg = new PS4Games();
        assertEquals("Calibrating with PS4 Games", psg.cal.play());
    }
}