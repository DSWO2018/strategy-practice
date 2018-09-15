package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.ICalibration;
/**Dvd calibration class.*/
public class DvdCalibration implements ICalibration {
    /**Herencia del método play. @return */
    public final String play() {
        return "Calibrating with DVD";
    }
}
