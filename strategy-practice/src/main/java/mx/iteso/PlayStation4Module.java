package mx.iteso;

import mx.iteso.strategy.Disc;
import mx.iteso.strategy.discs.Bluray;
import mx.iteso.strategy.discs.DVD;
import mx.iteso.strategy.discs.DataDiscs;
import mx.iteso.strategy.discs.MusicCDs;
import mx.iteso.strategy.discs.PS4Games;
/**Play Station class.*/
public class PlayStation4Module {

    /**Método para usar las demás clases.*/
    public final void usePlayStation4Module() {
        Disc dvd = new DVD();
        Disc bluray = new Bluray();
        Disc dataDisc = new DataDiscs();
        Disc musicCd = new MusicCDs();
        Disc ps4game = new PS4Games();

        System.out.println(dvd.getCal().play());
        System.out.println(bluray.getCal().play());
        System.out.println(dataDisc.getCal().play());
        System.out.println(musicCd.getCal().play());
        System.out.println(ps4game.getCal().play());

    }
}
