package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.impl.DataDiscsCalibration;
import mx.iteso.strategy.Disc;
/**Data discs class. */
public class DataDiscs extends Disc {
    /**Constructor. */
    public DataDiscs() {
        cal = new DataDiscsCalibration();
    }
}
