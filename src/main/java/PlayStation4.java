import discos.Disco;
/**clase.*/
public class PlayStation4 {
        /**variable lol. */
        private Disco disc;
        /**metodo.
         * @param disco disco.*/
        public final void setDisc(final Disco disco) {
            this.disc = disco;
        }
        /**metodo.
         * @return disco jalando al 100 calibrado y toda la cosa*/
        public final String play() {
            return disc.run();
        }

}
