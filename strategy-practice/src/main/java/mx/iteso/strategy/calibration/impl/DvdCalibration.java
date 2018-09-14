package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.iCalibration;
/**Dvd calibration class.*/
public class DvdCalibration implements iCalibration {
    /**Herencia del método play. @return */
    public final String play() {
        return ("Calibrating with DVD");
    }
}
