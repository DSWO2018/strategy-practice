package mx.iteso.strategy.discs;
import mx.iteso.strategy.calibration.impl.DvdCalibration;
import mx.iteso.strategy.Disc;
/**DVD Class.*/
public class DVD extends Disc {
    /**Constructor.*/
    public DVD() {
        cal = new DvdCalibration();
    }
}
