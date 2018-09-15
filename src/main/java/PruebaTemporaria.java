import discos.*;
public class PruebaTemporaria {
    public static void main(String[] args) {
        PlayStation4 p = new PlayStation4();
        p.setDisc(new PlayStation4Disc());
        System.out.println(p.play());
    }
}
