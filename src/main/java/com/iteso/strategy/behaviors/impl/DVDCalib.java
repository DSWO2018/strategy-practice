package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iCalibrate;

public class DVDCalib implements iCalibrate {
    public final String calibrate() {
        return "DVD calibrated";
    }
}