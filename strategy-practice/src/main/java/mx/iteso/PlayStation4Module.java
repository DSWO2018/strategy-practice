package mx.iteso;

import mx.iteso.strategy.Disc;
import mx.iteso.strategy.discs.Bluray;
import mx.iteso.strategy.discs.DVD;
import mx.iteso.strategy.discs.DataDiscs;
import mx.iteso.strategy.discs.MusicCDs;
import mx.iteso.strategy.discs.PS4Games;
/**Play Station class.*/
class PlayStation4Module {
    /**Main for class @param args .*/
    private static void main(final String[] args) {
        Disc dvd = new DVD();
        Disc bluray = new Bluray();
        Disc dataDisc = new DataDiscs();
        Disc musicCd = new MusicCDs();
        Disc ps4game = new PS4Games();

        dvd.cal.play();
        bluray.cal.play();
        dataDisc.cal.play();
        musicCd.cal.play();
        ps4game.cal.play();

    }
}
