package mx.iteso.calibraciones.impl;

import mx.iteso.calibraciones.Calibracion;
/**Calibrar Music CD.*/
public class CalMusicCD implements Calibracion {
    /**Override de calibrar.
     * @return calibracion.
     * */
    public String calibrar() {
        return "Calibrando un CD de Musica";
    }
}
