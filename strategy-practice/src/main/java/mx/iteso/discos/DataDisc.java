package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalDataDisc;

public class DataDisc extends Disco {

    public DataDisc() {
        calibracion = new CalDataDisc();
        type = "Data Disc";
    }
}
