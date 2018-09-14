package mx.iteso.strategy.discs;

import mx.iteso.strategy.calibration.impl.BlurayCalibration;
import mx.iteso.strategy.Disc;
/**Bluray class.*/
public class Bluray extends Disc {
    /**Herencia del constructor.*/
    public Bluray() {
        setCal(new BlurayCalibration());
    }
}
