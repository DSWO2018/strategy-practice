package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.iCalibration;
/**Data disc calibration class. */
public class DataDiscsCalibration implements iCalibration {
    /**Herencia del método play. @return . */
    public final String play() {
        return ("Calibrating with Data Discs");
    }
}
