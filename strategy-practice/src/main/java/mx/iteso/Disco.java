/**
 * Practica de Diseño de Software.
 *
 * @author Alejandro
 * @version 1.0
 */

package mx.iteso;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import mx.iteso.calibraciones.Calibracion;

/**Clase abstracta Disco.*/
public abstract class Disco {
    /**
     * Variable calibracion.
     */
    private Calibracion calibracion;
    /**
     * Variable type.
     */
    private String type;

    /**
     * Constructor.
     */
    public Disco() {
    }

    /**
     * Metodo diferente en cada disco.
     *
     * @return regresa las calibraciones
     */
    public String calibracion() {
        return calibracion.calibrar();
    }

    /**
     * Simple get.
     *
     * @return regresa el type
     */
    @Getter
     public String getType() {
        return this.type;
    }
    /**
     * Simple set.
     * @param xType sirve para modificar el tipo.
     *
     * */
    @Setter
     public void setType(final String xType) {
        this.type = xType;
    }

}