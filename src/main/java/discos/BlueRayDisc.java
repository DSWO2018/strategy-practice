package discos;

import discos.calibradores.CalibradorBlueRay;

/** clase. */
public class BlueRayDisc extends Disco {
    /** comentario serio y formal.
     * @return mensaje de calibrado y luego lo que
     * hace al run diferente de los otros blue rays */
    public final String run() {
        super.setCalibrator(new CalibradorBlueRay());
        return this.calibrate() + "Disfruta de tu película";
    }
}
