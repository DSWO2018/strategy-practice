package com.iteso.strategy;

import com.iteso.strategy.behaviors.iCalibrate;

public abstract class Disc {
    private iCalibrate calibrate;

    public final iCalibrate getCalibrate() {
        return calibrate;
    }

    public final void setCalibrate(final iCalibrate calibrated) {
        this.calibrate = calibrated;
    }

    public Disc() {

    }
}