package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalDataDisc;

public class DataDisc extends Disco {

    public DataDisc() {
       // setCalibration(new CalDataDisc());
        calibracion();
        setType("Data Disk");
    }
}
