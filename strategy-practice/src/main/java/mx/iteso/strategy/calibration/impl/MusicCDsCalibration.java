package mx.iteso.strategy.calibration.impl;

import mx.iteso.strategy.calibration.iCalibration;
/**Music CD's calibration class.*/
public class MusicCDsCalibration implements iCalibration {
    /**Herencia del método play. @return .*/
    public final String play() {
        return ("Calibrating with Music CD's");
    }
}
