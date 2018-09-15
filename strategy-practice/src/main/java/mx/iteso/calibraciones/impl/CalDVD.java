package mx.iteso.calibraciones.impl;

import mx.iteso.calibraciones.Calibracion;
/**Calibracion de DVD.*/
public class CalDVD implements Calibracion {
    /**Oveerride de calibrar.
     * @return calibracion.
     * */
    public String calibrar() {
        return "Calibrando un DVD";
    }
}
