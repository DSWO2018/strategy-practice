package mx.iteso.calibraciones.impl;

import mx.iteso.calibraciones.Calibracion;
/**Calibracion de un Blu-ray.*/
public class CalBluray implements Calibracion {
    /**Override del metodo calibrar.
     * @return calibracion.
     * */
    public String calibrar() {
        return "Calibrando un Bluray";
    }
}
