package mx.iteso.StrategyDisc.disctype;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.calibration.implementation.BrCali;

public class Bluray extends Disc {
    public Bluray() {
        setCalibrate(new BrCali());
    }
}
