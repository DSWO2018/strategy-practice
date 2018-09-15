package mx.iteso;

import mx.iteso.StrategyDisc.Disc;
import mx.iteso.StrategyDisc.disctype.Bluray;
import mx.iteso.StrategyDisc.disctype.DVD;
import mx.iteso.StrategyDisc.disctype.Game;
import mx.iteso.StrategyDisc.disctype.Music;
import mx.iteso.StrategyDisc.disctype.Data;

public class Ps4 {

    public final void ps4Usage() {
        Disc br = new Bluray();
        Disc dvd = new DVD();
        Disc music = new Music();
        Disc game = new Game();
        Disc data = new Data();

        System.out.println(dvd.getCalibrate().execute());
        System.out.println(br.getCalibrate().execute());
        System.out.println(music.getCalibrate().execute());
        System.out.println(game.getCalibrate().execute());
        System.out.println(data.getCalibrate().execute());

    }
}
