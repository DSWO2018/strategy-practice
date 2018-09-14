package mx.iteso.strategy.calibration.impl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DataDiscsCalibrationTest {
    @Test
    public void testDataDiscsCalibration() {
        DataDiscsCalibration dd = new DataDiscsCalibration();
        assertEquals("Calibrating with Data Discs", dd.play());
    }
}