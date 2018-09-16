package discos;
import discos.calibradores.CalibradorDVD;

/** clase. */
public class DVD extends Disco {
    /** comentario serio y formal.
     * @return mensaje de calibrado y luego lo que
     * hace al run diferente de los otros blue rays */
    public final String run() {
        super.setCalibrator(new CalibradorDVD());
        return this.calibrate() + "Disfruta de tu DVD";
    }
}
