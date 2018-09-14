package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.ICalibration;
/**Bluray calibration class.*/
public class BlurayCalibration implements ICalibration {
    /**Herencia del método play. @return */
    public final String play() {
        return "Calibrating with Bluray";
    }
}
