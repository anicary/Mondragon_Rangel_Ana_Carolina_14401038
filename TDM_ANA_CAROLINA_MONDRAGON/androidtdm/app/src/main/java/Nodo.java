import android.widget.TextView;

/**
 * Created by Carolina Mondragon on 14/02/2018.
 */

public class Nodo {
    TextView texto;
    Nodo sig;

    public Nodo(TextView t) {
        texto = t;
        sig = null;
    }
}
