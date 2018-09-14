package mx.iteso.strategy.calibration.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DvdCalibrationTest {
    @Test
    public void testDvdCalibration() {
        DvdCalibration dvd = new DvdCalibration();
        assertEquals("Calibrating with DVD", dvd.play());
    }
}