package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.CdCalibrator;

/**
 * Created by Palaf on 13/09/2018.
 */
public class CdDisc extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new CdCalibrator();
    }
}

