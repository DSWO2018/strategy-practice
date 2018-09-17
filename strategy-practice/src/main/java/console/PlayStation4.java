/**
 * Paquete de trabajo para las consolas.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */

package console;

import discs.Disc;
import calibrating.Calibrate;


/**
 * Clase para probar los tipos de calibracion en una playstation 4.
 */
public class PlayStation4 {
    /**
     * Variable para la calibracion.
     */
    private  Calibrate calibrator;

    /**
     * Getter del calibrador.
     *
     * @return retorna la calibracion.
     */
    public final Calibrate getCalibrator() {
        return calibrator;
    }

    /**
     * Se da el tipo de calibración.
     * @param calibratorv da el tipo a calibrar.
     */
    public final void setCalibrator(final Calibrate calibratorv) {
        this.calibrator = calibratorv;
    }

    /**
     * Le un tipo de objeto que exitenda de disco.
     * @param disc da el disco a leer.
     * @return retorna la calibracion que se ejecuta.
     */
    public final String readDisc(final Disc disc) {
        setCalibrator(disc.setCalibrate());
        return calibrator.calibrating();
    }

}
