package mx.iteso.StrategyDisc;

import mx.iteso.StrategyDisc.calibration.ICalibrate;

public abstract class Disc {
    private ICalibrate calibrate;

    public final ICalibrate getCalibrate() {
        return calibrate;
    }

    public final void setCalibrate(final ICalibrate calibrated) {
        this.calibrate = calibrated;
    }

    public Disc() {

    }
}
