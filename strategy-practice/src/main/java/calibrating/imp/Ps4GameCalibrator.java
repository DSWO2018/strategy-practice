/**
 * Paquete de trabajo para implemetación de calibradores.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package calibrating.imp;

import calibrating.Calibrate;

/**
 * Clase para calibrar juegos de play 4.
 */
public class Ps4GameCalibrator implements Calibrate {
    /**
     * Calibra un dico de playstation 4.
     *
     * @return retorna la calibracion.
     */
    public final String calibrating() {
        return "I'm calibrating a ps4 game";

    }
}
