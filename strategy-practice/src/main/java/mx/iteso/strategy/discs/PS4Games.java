package mx.iteso.strategy.discs;


import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.calibration.impl.iPS4Games;
import mx.iteso.strategy.Disc;

public class PS4Games extends Disc {
    public calibration setCalibration() {
        return new iPS4Games();
    }
}
