package discos;
import discos.calibradores.Calibrador;
/** disco. */
public abstract class Disco {
    /** variable. */
    private Calibrador calibrador;

    /** metodo.
     * @param cali  */
    public final void setCalibrator(final Calibrador cali) {
        this.calibrador = cali;
    }

    /** metodo.
     * @return mensaje de calibracion */
    public final String calibrate() {
        return this.calibrador.calibrate();
    }

    /** metodo.
     * @return mensaje de que el disco ya está calibrado y corriendo */
    public abstract String run();
}
