package mx.iteso.calibraciones.impl;

import mx.iteso.calibraciones.Calibracion;
/**Calibrar un juego.*/
public class CalPS4Game implements Calibracion {
    /**Override de calibrar.
     * @return calibracion.
     * */
    public String calibrar() {
        return "Calibrando un Juego de PS4";
    }
}
