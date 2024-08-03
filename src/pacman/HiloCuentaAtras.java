package pacman;

/**
 * Espera de tiempo y ser invulnerable a los fantasmas.
 *
 * @author Jossibel Perez
 * @author Maria Chuico
 */
public class HiloCuentaAtras implements Runnable {

    private Juego padre;

    public HiloCuentaAtras(Juego padre) {
        this.padre = padre;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2500);
            this.padre.setFantasmasInvulnerables();
        } catch (InterruptedException ex) {
            System.out.println("ERROR - Con HiloCuentaAtras " + ex);
        }
    }

}
