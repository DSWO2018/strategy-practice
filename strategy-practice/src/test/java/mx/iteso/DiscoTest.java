package mx.iteso;

import mx.iteso.discos.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscoTest {

    Disco mockedBluray;
    Disco mockedDataDisc;
    Disco mockedDVD;
    Disco mockedMusicCD;
    Disco mockedPS4Game;

    @Before
    public void setUp(){
        mockedBluray = mock(BlurayDisc.class);
        mockedDataDisc = mock(DataDisc.class);
        mockedDVD = mock(DVD.class);
        mockedMusicCD = mock(MusicCD.class);
        mockedPS4Game = mock(PS4Game.class);
    }

    @Test
    public void testCalibraciones() {
        when(mockedBluray.calibracion()).thenReturn("Calibrando un Blu-ray");
        when(mockedDataDisc.calibracion()).thenReturn("Calibrando un Disco de datos");
        when(mockedDVD.calibracion()).thenReturn("Calibrando un DVD");
        when(mockedMusicCD.calibracion()).thenReturn("Calibrando un CD de Musica");
        when(mockedPS4Game.calibracion()).thenReturn("Calibrando un Juego de PS4");
    }

    @Test
    public void testTypes(){
        when(mockedBluray.getType()).thenReturn("Blu-ray Disk");
        when(mockedDataDisc.getType()).thenReturn("Data Disk");
        when(mockedDVD.getType()).thenReturn("DVD");
        when(mockedMusicCD.getType()).thenReturn("CD Music");
        when(mockedPS4Game.getType()).thenReturn("PS4 Game");
    }
}