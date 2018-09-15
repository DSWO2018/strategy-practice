import discos.Disco;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class PlayStation4Test {
    PlayStation4 p;
    Disco d;
    @Before
    public void setUp(){
        p = new PlayStation4();
        d = mock(Disco.class);
        p.setDisc(d);
    }

    @Test
    public void play(){
        when(d.run()).thenReturn("Calibración genérica exitosa\n Disfruta de tu disco genérico");
        assertEquals(p.play(),"Calibración genérica exitosa\n Disfruta de tu disco genérico");
    }
}
