package mx.iteso.strategy.calibration.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PS4GamesCalibrationTest {
    @Test
    public void testPS4GamesCalibration() {
        PS4GamesCalibration psg = new PS4GamesCalibration();
        assertEquals("Calibrating with PS4 Games", psg.play());
    }
}