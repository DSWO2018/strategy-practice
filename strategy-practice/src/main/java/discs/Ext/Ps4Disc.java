package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.Ps4GameCalibrator;

/**
 * Created by Palaf on 13/09/2018.
 */
public class Ps4Disc extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new Ps4GameCalibrator();
    }
}
