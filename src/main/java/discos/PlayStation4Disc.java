package discos;
import discos.calibradores.CalibradorBlueRay;

/** clase. */
public class PlayStation4Disc extends Disco {
    /** comentario serio y formal.
     * @return mensaje de calibrado y luego lo que
     * hace al run diferente de los otros blue rays */
    public String run() {
        super.setCalibrator(new CalibradorBlueRay());
        return this.calibrate() + "Disfruta de tu juego";
    }
}
