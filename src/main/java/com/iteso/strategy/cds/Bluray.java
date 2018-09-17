package com.iteso.strategy.cds;

import com.iteso.strategy.Disc;
import com.iteso.strategy.behaviors.impl.BlurayCalib;

public class Bluray extends Disc {
    public Bluray() {
        setCalibrate(new BlurayCalib());
    }
}