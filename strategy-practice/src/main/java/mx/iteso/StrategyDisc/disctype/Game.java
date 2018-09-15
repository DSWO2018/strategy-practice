package mx.iteso.StrategyDisc.disctype;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.calibration.implementation.GCali;

public class Game extends Disc {
    public Game() {
        setCalibrate(new GCali());
    }
}
