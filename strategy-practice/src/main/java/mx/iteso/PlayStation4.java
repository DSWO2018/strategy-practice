package mx.iteso;

/**
 * Created by Alan on 9/13/18.
 */
public class PlayStation4 {
    /**Varible disc.*/
    private Disc disc;
    /**Funcion setDisc.
     * @param d disco.*/
    public final void setDisc(final Disc d) {
        disc = d;
    }
    /**Funcion play.
     * @return mensaje de calibración*/
    public final String play() {
        return disc.calibrate();
    }

}
