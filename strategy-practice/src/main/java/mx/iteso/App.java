package mx.iteso;
/** {@package-info} */
/**
 * Created by Alan on 9/13/18.
 * PlayStationApp
 *
 */
public final class App {
    /**Constructor.*/
    private App() { };
    /**Funcion MAIN.
     * @param args .*/
    public static void main(final String[] args) {
        PlayStation4 ps = new PlayStation4();
        Disc music = new MusicDisc();
        Disc blueRay = new BlueRayDisc();
        Disc ps4Game = new Ps4GameDisc();
        Disc data = new DataDisc();
        Disc dvd = new DvdDisc();
        ps.setDisc(music);
        System.out.println(ps.play());

        ps.setDisc(blueRay);
        System.out.println(ps.play());

        ps.setDisc(ps4Game);
        System.out.println(ps.play());

        ps.setDisc(data);
        System.out.println(ps.play());

        ps.setDisc(dvd);
        System.out.println(ps.play());
    }
}
