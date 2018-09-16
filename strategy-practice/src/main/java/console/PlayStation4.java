package console;

import discs.Disc;
import calibrating.Calibrate;

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

    public String ReadDisk(Disc disc){
        setCalibrator(disc.setCalibrate());
        return calibrator.calibrating();
    }

}
