package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalDVD;

public class DVD extends Disco {

    public DVD(){
       // setCalibration(new CalDVD());
        calibracion();
        setType("DVD");
    }
}
