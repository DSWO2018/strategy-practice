package discos;
import discos.calibradores.Calibrador;

/** clase. */
public class DataDisc extends Disco {
    /** comentario serio y formal.
     * @return mensaje de calibrado y luego lo que
     * hace al run diferente de los otros blue rays */
    public final String run() {
        try {
            return this.calibrate() + "Aquí están tus datos:";
        } catch (NullPointerException e) {
            return "Primero específica el tipo de disco";
        }
    }

    /** metodo.
     * @param c */
    public final void setCalibrador(final Calibrador c) {
        super.setCalibrator(c);
    }
}
