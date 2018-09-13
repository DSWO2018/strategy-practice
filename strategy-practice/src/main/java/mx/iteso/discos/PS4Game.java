package mx.iteso.discos;

import mx.iteso.Disco;
import mx.iteso.calibraciones.impl.CalPS4Game;

public class PS4Game extends Disco {

    public PS4Game(){
        calibracion = new CalPS4Game();
        type = "PS4 Game";
    }
}
