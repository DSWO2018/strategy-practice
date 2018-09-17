package com.iteso.strategy.cds;

import com.iteso.strategy.Disc;
import com.iteso.strategy.behaviors.impl.GameCalib;

public class GameCD extends Disc {
    public GameCD() {
        setCalibrate(new GameCalib());
    }
}