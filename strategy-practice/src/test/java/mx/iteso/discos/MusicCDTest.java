package mx.iteso.discos;

import mx.iteso.Disco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicCDTest {
    Disco disk;

    @Before
    public void setUp() {
        disk = new MusicCD();
    }

    @Test
    public void testType(){
        assertEquals("CD Music", disk.getType());
    }
}