import com.iteso.strategy.Disc;
import com.iteso.strategy.cds.*;

public class PS4CdModule {

        public final void ps4Use() {
            Disc br = new Bluray();
            Disc dvd = new DVD();
            Disc music = new Music();
            Disc game = new GameCD();
            Disc data = new DataCD();

            System.out.println(dvd.getCalibrate().calibrate());
            System.out.println(br.getCalibrate().calibrate());
            System.out.println(music.getCalibrate().calibrate());
            System.out.println(game.getCalibrate().calibrate());
            System.out.println(data.getCalibrate().calibrate());

        }
    }