package mx.iteso.discos;

import mx.iteso.Disco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlurayDiscTest {
    Disco disk;

    @Before
    public void setUp(){
        disk = new BlurayDisc();
    }

    @Test
    public void testType(){
        assertEquals("Blu-ray Disc", disk.getType());
    }
}