package mx.edu.ittepic.tarea_tdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity { TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21;
    Nodo nodo1, nodo2, nodo3, nodo4, nodo5, nodo6, nodo7, nodo8, nodo9, nodo10, nodo11, nodo12, nodo13, nodo14, nodo15, nodo16, nodo17, nodo18, nodo19, nodo20, nodo21;
    EditText texto;
    Button boton;
    Random r;
    Hilo h;
    Thread hilo;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);
        text6 = findViewById(R.id.textView6);
        text7 = findViewById(R.id.textView7);
        text8 = findViewById(R.id.textView8);
        text9 = findViewById(R.id.textView9);
        text10 = findViewById(R.id.textView10);
        text11 = findViewById(R.id.textView11);
        text12 = findViewById(R.id.textView12);
        text13 = findViewById(R.id.textView13);
        text14 = findViewById(R.id.textView14);
        text15 = findViewById(R.id.textView15);
        text16 = findViewById(R.id.textView16);
        text17 = findViewById(R.id.textView17);
        text18 = findViewById(R.id.textView18);
        text19 = findViewById(R.id.textView19);
        text20 = findViewById(R.id.textView20);
        text21 = findViewById(R.id.textView21);

        nodo1 = new Nodo(text1);
        nodo2 = new Nodo(text2);
        nodo3 = new Nodo(text3);
        nodo4 = new Nodo(text4);
        nodo5 = new Nodo(text5);
        nodo6 = new Nodo(text6);
        nodo7 = new Nodo(text7);
        nodo8 = new Nodo(text8);
        nodo9 = new Nodo(text9);
        nodo10 = new Nodo(text10);
        nodo11 = new Nodo(text11);
        nodo12 = new Nodo(text12);
        nodo13 = new Nodo(text13);
        nodo14 = new Nodo(text14);
        nodo15 = new Nodo(text15);
        nodo16 = new Nodo(text16);
        nodo17 = new Nodo(text17);
        nodo18 = new Nodo(text18);
        nodo19 = new Nodo(text19);
        nodo20 = new Nodo(text20);
        nodo21 = new Nodo(text21);

        nodo1.sig = nodo2;
        nodo2.sig = nodo3;
        nodo3.sig = nodo4;
        nodo4.sig = nodo5;
        nodo5.sig = nodo6;
        nodo6.sig = nodo7;
        nodo7.sig = nodo8;
        nodo8.sig = nodo9;
        nodo9.sig = nodo10;
        nodo10.sig = nodo11;
        nodo11.sig = nodo12;
        nodo12.sig = nodo13;
        nodo13.sig = nodo14;
        nodo14.sig = nodo15;
        nodo15.sig = nodo16;
        nodo16.sig = nodo17;
        nodo17.sig = nodo18;
        nodo18.sig = nodo19;
        nodo19.sig = nodo20;
        nodo20.sig = nodo21;
        nodo21.sig = nodo1;

        texto = findViewById(R.id.editText);
        boton = findViewById(R.id.button);
        r = new Random();
        h = new Hilo(nodo1);
        hilo = new Thread(h);
        resultado = r.nextFloat() * (3.0 - 1.0) + 1.0;
        texto.setText(String.format("%.1f", resultado));
        hilo.start();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hilo.stop();
                //h.estado=false;
                //h.nodo.texto.setTextColor(Color.RED);
                //if (h.nodo.texto.getText().equals(texto.getText())) {
                //   Toast.makeText(getApplicationContext(), "¡Ganaste!", Toast.LENGTH_LONG).show();
                //} else {
                //   Toast.makeText(getApplicationContext(), "Fallaste", Toast.LENGTH_LONG).show();
                //}
            }
        });
    }
}