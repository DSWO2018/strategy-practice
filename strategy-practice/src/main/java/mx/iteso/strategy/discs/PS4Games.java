package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.impl.PS4GamesCalibration;
import mx.iteso.strategy.Disc;
/**PS4 Games class.*/
public class PS4Games extends Disc {
    /**Constructor.*/
    public PS4Games() {
        setCal(new PS4GamesCalibration());
    }
}
