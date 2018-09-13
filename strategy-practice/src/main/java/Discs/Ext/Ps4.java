package Discs.Ext;

import Discs.Disc;
import calibration.Calibrate;
import calibration.imp.BlurayDiscs;
import calibration.imp.Ps4Games;

/**
 * Created by Palaf on 13/09/2018.
 */
public class Ps4 extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new Ps4Games();
    }
}
