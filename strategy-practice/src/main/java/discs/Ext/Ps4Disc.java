/**
 * Paquete de trabajo para las consolas.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.Ps4GameCalibrator;

/**
 * Clase para probar los discos de PlayStation4.
 */
public class Ps4Disc extends Disc {
    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    @Override
    public final Calibrate setCalibrate() {
        return new Ps4GameCalibrator();
    }
}
