package mx.iteso.discos;

import mx.iteso.Disco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataDiscTest {
    Disco disk;

    @Before
    public void setUp() {
        disk = new DataDisc();
    }

    @Test
    public void testType(){
        assertEquals("Data Disk", disk.getType());
    }
}