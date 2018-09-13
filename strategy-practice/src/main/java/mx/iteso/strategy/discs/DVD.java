package mx.iteso.strategy.discs;


import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.calibration.impl.iDVD;
import mx.iteso.strategy.Disc;

public class DVD extends Disc {
    public calibration setCalibration() {
        return new iDVD();
    }
}
