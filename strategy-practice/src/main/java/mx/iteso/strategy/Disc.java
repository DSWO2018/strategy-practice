package mx.iteso.strategy;

import mx.iteso.strategy.calibration.ICalibration;

/**Disc abstract class.*/
public abstract class Disc {
    /**variable tipo calibration.*/
    private ICalibration cal;
    /**Método getter. @return . */
    public final ICalibration getCal() {
        return cal;
    }
    /**método setter. @param cali . */
    public final void setCal(final ICalibration cali) {
        this.cal = cali;
    }

    /**método constructor.*/
    public Disc() {

    }

}
