package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalDVD;

public class DVD extends Disco {

    public DVD(){
        calibracion = new CalDVD();
        type = "DVD";
    }
}
