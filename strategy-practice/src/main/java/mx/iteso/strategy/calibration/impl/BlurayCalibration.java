package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.iCalibration;
/**Bluray calibration class.*/
public class BlurayCalibration implements iCalibration {
    /**Herencia del método play. @return */
    public final String play() {
        return "Calibrating with Bluray";
    }
}
