package console;

import Discs.Disc;
import calibration.Calibrate;

/**
 * Created by Palaf on 13/09/2018.
 */
public class PlayStation4 {
    private Calibrate calibrator;

    public Calibrate getCalibrator() {
        return calibrator;
    }

    public void setCalibrator(Calibrate calibrator) {
        this.calibrator = calibrator;
    }

    public void ReadDisk(Disc disc){
        setCalibrator(disc.setCalibrate());
    }

}
