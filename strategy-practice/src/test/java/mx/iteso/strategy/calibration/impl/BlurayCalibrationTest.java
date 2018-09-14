package mx.iteso.strategy.calibration.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlurayCalibrationTest {
    @Test
    public void testBlurayCalibration() {
        BlurayCalibration bluray = new BlurayCalibration();
        assertEquals("Calibrating with Bluray", bluray.play());
    }
}