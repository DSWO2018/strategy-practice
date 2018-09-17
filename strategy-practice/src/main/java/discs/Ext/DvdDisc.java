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
import calibrating.imp.DvdCalibrator;

/**
 * Clase para probar los discos de Dvd.
 */
public class DvdDisc extends Disc {
    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    @Override
    public final Calibrate setCalibrate() {
        return new DvdCalibrator();
    }
}

