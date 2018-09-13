package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.calibration.impl.iBluray;
import mx.iteso.strategy.Disc;

public class Bluray extends Disc {
    public calibration setCalibration() {
        return new iBluray();
    }
}
