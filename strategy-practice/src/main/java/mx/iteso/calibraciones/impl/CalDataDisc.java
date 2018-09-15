package mx.iteso.calibraciones.impl;

import mx.iteso.calibraciones.Calibracion;
/**Calibracion de un DataDisk.*/
public class CalDataDisc implements Calibracion {
    /**Override de calibrar.
     * @return calibracion.*/
    public String calibrar() {
        return "Calibrando un Disco de datos";
    }
}
