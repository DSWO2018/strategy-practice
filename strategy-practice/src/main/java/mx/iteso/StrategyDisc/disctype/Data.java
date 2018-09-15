package mx.iteso.StrategyDisc.disctype;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.calibration.implementation.DDCali;

public class Data extends Disc {
    public Data() {
        setCalibrate(new DDCali());
    }
}
