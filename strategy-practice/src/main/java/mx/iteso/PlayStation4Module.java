package mx.iteso;

import mx.iteso.strategy.Disc;
import mx.iteso.strategy.discs.*;


public class PlayStation4Module {
    public static void main (String[] args) {
        Disc dvd = new DVD();
        Disc bluray = new Bluray();
        Disc dataDisc = new DataDiscs();
        Disc musicCd = new MusicCDs();
        Disc ps4game = new PS4Games();

        dvd.setCalibration().play();
        bluray.setCalibration().play();
        dataDisc.setCalibration().play();
        musicCd.setCalibration().play();
        ps4game.setCalibration().play();

    }
}
