package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.ICalibration;
/**Data disc calibration class. */
public class DataDiscsCalibration implements ICalibration {
    /**Herencia del método play. @return . */
    public final String play() {
        return ("Calibrating with Data Discs");
    }
}
