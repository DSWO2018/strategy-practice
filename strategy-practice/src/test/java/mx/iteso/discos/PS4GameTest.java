package mx.iteso.discos;

import mx.iteso.Disco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PS4GameTest {
    Disco disk;

    @Before
    public void setUp() {
        disk = new PS4Game();
    }

    @Test
    public void testType(){
        assertEquals("PS4 Game", disk.getType());
    }
}