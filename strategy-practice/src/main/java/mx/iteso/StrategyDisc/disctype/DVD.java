package mx.iteso.StrategyDisc.disctype;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.calibration.implementation.DVDCali;

public class DVD extends Disc {
    public DVD() {
        setCalibrate(new DVDCali());
    }
}
