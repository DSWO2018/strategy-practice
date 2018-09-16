package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.DvdCalibrator;

/**
 * Created by Palaf on 13/09/2018.
 */
public class DvdDisc extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new DvdCalibrator();
    }
}

