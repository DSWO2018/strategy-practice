package Discs.Ext;

import Discs.Disc;
import calibration.Calibrate;
import calibration.imp.BlurayDiscs;

/**
 * Created by Palaf on 13/09/2018.
 */
public class Bluray extends Disc{
    @Override
    public Calibrate setCalibrate() {
        return new BlurayDiscs();
    }
}
