package Discs.Ext;

import Discs.Disc;
import calibration.Calibrate;
import calibration.imp.MusicCDs;

/**
 * Created by Palaf on 13/09/2018.
 */
public class Cd extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new MusicCDs();
    }
}

