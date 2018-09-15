package mx.iteso.discos;

import mx.iteso.Disco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DVDTest {
    Disco disk;

    @Before
    public void setUp() {
        disk = new DVD();
    }

    @Test
    public void testType(){
        assertEquals("DVD", disk.getType());
    }
}