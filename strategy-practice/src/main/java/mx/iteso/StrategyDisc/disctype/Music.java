package mx.iteso.StrategyDisc.disctype;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.calibration.implementation.MCDCali;

public class Music extends Disc {
    public Music() {
        setCalibrate(new MCDCali());
    }
}
