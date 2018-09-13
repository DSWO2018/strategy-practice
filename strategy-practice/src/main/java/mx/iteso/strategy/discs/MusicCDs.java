package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.calibration.impl.iMusicCDs;
import mx.iteso.strategy.Disc;

public class MusicCDs extends Disc {
    public calibration setCalibration() {
        return new iMusicCDs();
    }
}
