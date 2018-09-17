package com.iteso.strategy.cds;

import com.iteso.strategy.Disc;
import com.iteso.strategy.behaviors.impl.DataCalib;

public class DataCD extends Disc {
    public DataCD() {
        setCalibrate(new DataCalib());
    }
}