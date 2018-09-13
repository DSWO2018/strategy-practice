package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalMusicCD;

public class MusicCD extends Disco {

    public MusicCD(){
        calibracion = new CalMusicCD();
        type = "CD Music";
    }
}
