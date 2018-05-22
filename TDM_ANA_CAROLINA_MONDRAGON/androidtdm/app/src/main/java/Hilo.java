import android.graphics.Color;

/**
 * Created by Carolina Mondragon on 14/02/2018.
 */

public class Hilo implements Runnable {
    Nodo nodo;
    boolean estado;

    public Hilo(Nodo nodo) {
        this.nodo = nodo;
        estado=true;
    }

    @Override
    public void run() {
        while (estado) {
            try {
                nodo = nodo.sig;
                nodo.texto.setTextColor(Color.RED);
                Thread.sleep(1500);
                nodo.texto.setTextColor(Color.BLACK);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

