package mx.iteso.strategy.consoles;

import mx.iteso.strategy.calibration.calibration;
import mx.iteso.strategy.Disc;

public class PlayStation4 {
    private calibration calibration;

    public void setCalibration(calibration calibration) {
        this.calibration = calibration;
    }

    public calibration getCalibration() {
        return calibration;
    }

    public void ReadDisc(Disc disc){
        setCalibration(disc.setCalibration());
    }
}
