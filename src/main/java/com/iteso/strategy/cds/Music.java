package com.iteso.strategy.cds;

import com.iteso.strategy.Disc;
import com.iteso.strategy.behaviors.impl.MusicCalib;

public class Music extends Disc {
    public Music() {
        setCalibrate(new MusicCalib());
    }
}