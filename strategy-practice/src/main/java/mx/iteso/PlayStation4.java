package mx.iteso;

/**
 * Created by Alan on 9/13/18.
 */
public class PlayStation4 {
    private Disc disc;
    public void setDisc(Disc d){
        disc=d;
    }
    public String play(){
        return disc.calibrate();
    }

}
