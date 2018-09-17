package com.iteso.strategy.cds;

import com.iteso.strategy.Disc;
import com.iteso.strategy.behaviors.impl.DVDCalib;

public class DVD extends Disc {
    public DVD() {
        setCalibrate(new DVDCalib());
    }
}