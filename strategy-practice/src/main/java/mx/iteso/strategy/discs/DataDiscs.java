package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.calibration.impl.iDataDiscs;
import mx.iteso.strategy.Disc;

public class DataDiscs extends Disc {
    public calibration setCalibration() {
        return new iDataDiscs();
    }
}
