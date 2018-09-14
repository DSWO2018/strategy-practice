package mx.iteso.strategy.discs;

import mx.iteso.strategy.Disc;
import mx.iteso.strategy.calibration.impl.MusicCDsCalibration;
/**Music CDs class.*/
public class MusicCDs extends Disc {
    /**Constructor.*/
    public MusicCDs() {
        setCal(new MusicCDsCalibration());
    }
}
