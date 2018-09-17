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
 * Clase para calibrar bluray.
 */
public class BlurayCalibrator implements Calibrate {
    /**
     * Calibra un dico bluray.
     *
     * @return retorna la calibracion.
     */
    public final String calibrating() {
        return "I'm calibrating a bluyray disc";
    }
}
