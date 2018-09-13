package mx.iteso;

import mx.iteso.calibraciones.calibracion;

public abstract class Disco {

    public calibracion calibracion;
    public String type;

    public Disco(){

    }

    public String calibracion(){
        return calibracion.calibrar();
    }

}
