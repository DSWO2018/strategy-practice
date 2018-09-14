package mx.iteso.strategy.calibration.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MusicCDsCalibrationTest {
    @Test
    public void testMusicCDsCalibration() {
        MusicCDsCalibration musicCDs = new MusicCDsCalibration();
        assertEquals("Calibrating with Music CD's", musicCDs.play());
    }
}