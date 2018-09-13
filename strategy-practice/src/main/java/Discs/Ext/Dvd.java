package Discs.Ext;

import Discs.Disc;
import calibration.Calibrate;
import calibration.imp.DvdDiscs;

/**
 * Created by Palaf on 13/09/2018.
 */
public class Dvd extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new DvdDiscs();
    }
}

