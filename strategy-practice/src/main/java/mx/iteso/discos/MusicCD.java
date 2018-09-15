package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.Calibracion;
import mx.iteso.calibraciones.impl.CalMusicCD;

public class MusicCD extends Disco {

    public MusicCD(){
       // setCalibration(new CalMusicCD());
        calibracion();
        setType("CD Music");
    }
}
