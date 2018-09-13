package PS4;

import Interface.Disc;
import Interface.calibrate;

public class PS4 {
    private calibrate c;

    public calibrate getC() {
        return c;
    }

    public void setC(calibrate c) {
        this.c = c;
    }

    public void readdisc(Disc disc){
        setC(disc.setcalibration());
    }
}
