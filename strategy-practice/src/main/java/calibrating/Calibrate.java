/**
 * Paquete de trabajo para implemetación de calibradores.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package calibrating;

/**
 * Interfas para los diferentes tipos de calibración.
 */
public interface Calibrate {
    /**
     * Se ve el tipo de disco que se esta calibrando.
     *
     * @return retorna la calibracion acorde al disco.
     */
    String calibrating();
}
