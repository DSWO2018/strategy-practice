package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalBluray;

public class BlurayDisc extends Disco {

    public BlurayDisc(){
        calibracion();
        setType("Blu-ray Disk");
    }
}
