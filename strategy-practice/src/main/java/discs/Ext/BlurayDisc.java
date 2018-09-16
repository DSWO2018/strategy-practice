package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.BlurayCalibrator;

/**
 * Created by Palaf on 13/09/2018.
 */
public class BlurayDisc extends Disc{
    @Override
    public Calibrate setCalibrate() {
        return new BlurayCalibrator();
    }
}
