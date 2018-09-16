package discs.Ext;

import discs.Disc;
import calibrating.Calibrate;
import calibrating.imp.DataCalibrator;

/**
 * Created by Palaf on 13/09/2018.
 */
public class DataDisc extends Disc {
    @Override
    public Calibrate setCalibrate() {
        return new DataCalibrator();
    }
}
