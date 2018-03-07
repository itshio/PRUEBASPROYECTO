package com.example.pruebasproyecto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AvanzadaActivity extends AppCompatActivity {

    static final String EXTRA_AVANZADA = "FORMULARIO";

    TextView agrupamientosganados_local, agrupamientosganados_visitante, agrupamientosperdidos_local, agrupamientosperdidos_visitante, avant_local, avant_visitante, recuperaciones_local, recuperaciones_visitante, placajes_local, placajes_visitante, contrarucks_local, contrarucks_visitante, drop_local, drop_visitante, ensayoscastigo_local, ensayoscastigo_visitante,
            juegopositivo_local, juegospositivo_visitante, juegonegativo_local, juegonegativo_visitante;

    int agrupamientosganados_local_int;
    int agrupamientosganados_visitante_int;
    int agrupamientosperdidos_local_int;
    int agrupamientosperdidos_visitante_int;
    int avant_local_int;
    int avant_visitante_int;
    int recuperaciones_local_int;
    int recuperaciones_visitante_int;
    int placajes_local_int;
    int placajes_visitante_int;
    int contrarucks_local_int;
    int contrarucks_visitante_int;
    int drop_local_int;
    int drop_visitante_int;
    int ensayoscastigo_local_int;
    int ensayoscastigo_visitante_int;
    int juegonegativo_local_int;
    int juegonegativo_visitante_int;
    int juegopositivo_local_int;
    int juegospositivo_visitante_int;

    /*int meleganada_local_int;
    int meleganada_visitante_int;
    int meleperdida_local_int;
    int meleperdida_visitante_int;
    int touchganada_local_int;
    int touchganada_visitante_int;
    int touchperdida_local_int;
    int touchperdida_visitante_int;
    int resultado_local_int;
    int resultado_visitante_int;
    int golpes_local_int;
    int golpes_visitante_int;
    int amarilla_local_int;
    int amarilla_visitante_int;
    int roja_local_int;
    int roja_visitante_int;

    int fecha_int;
    String equipo_local_int;
    String equipo_visitante_int;*/

    Resultado r=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanzada);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        agrupamientosganados_local = (TextView) findViewById(R.id.agrupamientoganado_local);
        agrupamientosganados_visitante = (TextView) findViewById(R.id.agrupamientoganado_visitante);
        agrupamientosperdidos_local = (TextView) findViewById(R.id.agrupamientoperdido_local);
        agrupamientosperdidos_visitante = (TextView) findViewById(R.id.agrupamientoperdido_visitante);
        avant_local = (TextView) findViewById(R.id.avant_local);
        avant_visitante = (TextView) findViewById(R.id.avant_visitante);
        recuperaciones_local = (TextView) findViewById(R.id.recuperaciones_local);
        recuperaciones_visitante = (TextView) findViewById(R.id.recuperaciones_visitante);
        placajes_local = (TextView) findViewById(R.id.placajes_local);
        placajes_visitante = (TextView) findViewById(R.id.placajes_visitante);
        contrarucks_local = (TextView) findViewById(R.id.avanzada_contrarucks_local);
        contrarucks_visitante = (TextView) findViewById(R.id.avanzada_contrarucks_visitante);
        drop_local = (TextView) findViewById(R.id.drop_local);
        drop_visitante = (TextView) findViewById(R.id.drop_visitante);
        ensayoscastigo_local = (TextView) findViewById(R.id.ensayos_local);
        juegonegativo_local = (TextView) findViewById(R.id.juegonegativo_local);
        juegonegativo_visitante = (TextView) findViewById(R.id.juegoperdido_visitante);
        juegopositivo_local = (TextView) findViewById(R.id.juegopositivo_local);
        juegospositivo_visitante = (TextView) findViewById(R.id.juegopositivo_visitante);

Bundle b = getIntent().getExtras();
        if(b!=null){
              r = b.getParcelable(FormularioActivity.EXTRA_FORMULARIO);

            agrupamientosganados_local.setText(r.getAgrupamientoganado_local()+"");
            agrupamientosganados_visitante.setText(r.getAgrupamientoganado_visitante()+"");
            agrupamientosperdidos_local.setText(r.getAgrupamientoperdido_local()+"");
            agrupamientosperdidos_visitante.setText(r.getAgrupamientoperdido_visitante()+"");
            avant_local.setText(r.getAvant_local()+"");
            avant_visitante.setText(r.getAvant_visitante()+"");
            recuperaciones_local.setText(r.getRecuperaciones_local()+"");
            recuperaciones_visitante.setText(r.getRecuperaciones_visitante()+"");
            placajes_local.setText(r.getPlacajes_local()+"");
            placajes_visitante.setText(r.getPlacajes_visitante()+"");
            contrarucks_local.setText(r.getContraruck_local()+"");
            contrarucks_visitante.setText(r.getContraruck_visitante()+"");
            drop_local.setText(r.getDrop_local()+"");
            ensayoscastigo_local.setText(r.getDrop_visitante()+"");
            juegonegativo_local.setText(r.getJuegoalpienegativo_local()+"");
            juegonegativo_visitante.setText(r.getJuegoalpienegativo_visitante()+"");
            juegopositivo_local.setText(r.getJuegoalpiepositivo_local()+"");
            juegospositivo_visitante.setText(r.getJuegoalpiepositivo_visitante()+"");




        }
    }

    public void click_atras(View view) {

        //recoger cada caja de texto

        contrarucks_local_int = Integer.parseInt(contrarucks_local.getText().toString());
        r.setContraruck_local(contrarucks_local_int);
        contrarucks_visitante_int = Integer.parseInt(contrarucks_visitante.getText().toString());
        r.setContraruck_visitante(contrarucks_visitante_int);
        agrupamientosganados_visitante_int = Integer.parseInt(agrupamientosganados_visitante.getText().toString());
        r.setAgrupamientoganado_visitante(agrupamientosganados_visitante_int);
        agrupamientosperdidos_local_int = Integer.parseInt(agrupamientosperdidos_local.getText().toString());
        r.setAgrupamientoperdido_local(agrupamientosperdidos_local_int);
        agrupamientosperdidos_visitante_int = Integer.parseInt(agrupamientosperdidos_visitante.getText().toString());
        r.setAgrupamientoperdido_visitante(agrupamientosperdidos_visitante_int);
        avant_local_int = Integer.parseInt(avant_local.getText().toString());
        r.setAvant_local(avant_local_int);
        avant_visitante_int = Integer.parseInt(avant_visitante.getText().toString());
        r.setAvant_visitante(avant_visitante_int);
        recuperaciones_local_int = Integer.parseInt(recuperaciones_local.getText().toString());
        r.setRecuperaciones_local(recuperaciones_local_int);
        recuperaciones_visitante_int = Integer.parseInt(recuperaciones_visitante.getText().toString());
        r.setRecuperaciones_visitante(recuperaciones_visitante_int);
        placajes_local_int = Integer.parseInt(placajes_local.getText().toString());
        r.setPlacajes_local(placajes_local_int);
        placajes_visitante_int = Integer.parseInt(placajes_visitante.getText().toString());
        r.setPlacajes_visitante(placajes_visitante_int);
        drop_local_int = Integer.parseInt(drop_local.getText().toString());
        r.setDrop_local(drop_local_int);
        drop_visitante_int = Integer.parseInt(drop_visitante.getText().toString());
        r.setDrop_visitante(drop_visitante_int);
        ensayoscastigo_local_int = Integer.parseInt(ensayoscastigo_local.getText().toString());
        r.setEnsayoscastigo_local(ensayoscastigo_local_int);
        juegonegativo_local_int = Integer.parseInt(juegonegativo_local.getText().toString());
        r.setJuegoalpienegativo_local(juegonegativo_local_int);
        juegonegativo_visitante_int = Integer.parseInt(juegonegativo_visitante.getText().toString());
        r.setJuegoalpienegativo_visitante(juegonegativo_visitante_int);
        juegopositivo_local_int = Integer.parseInt(juegopositivo_local.getText().toString());
        r.setJuegoalpiepositivo_local(juegonegativo_local_int);
        juegospositivo_visitante_int = Integer.parseInt(juegospositivo_visitante.getText().toString());
        r.setJuegoalpiepositivo_visitante(juegospositivo_visitante_int);




        Intent form_atras = new Intent(getApplicationContext(), FormularioActivity.class);

        form_atras.putExtra(EXTRA_AVANZADA,r);
        startActivity(form_atras);
    }

    public void clicksumar_contrarucks_local(View view) {

        if (contrarucks_local_int < 100) {
            contrarucks_local_int = contrarucks_local_int + 1;

            contrarucks_local.setText(contrarucks_local_int + "");
        }
    }

    public void clicksumar_contrarucks_visitante(View view) {

        if (contrarucks_visitante_int < 100) {
            contrarucks_visitante_int = contrarucks_visitante_int + 1;

            contrarucks_visitante.setText(contrarucks_visitante_int + "");
        }
    }

    public void clicksumar_placajes_local(View view) {

        if (placajes_local_int < 100) {
            placajes_local_int = placajes_local_int + 1;

            placajes_local.setText(placajes_local_int + "");
        }
    }

    public void clicksumar_placajes_visitante(View view) {

        if (placajes_visitante_int < 100) {
            placajes_visitante_int = placajes_visitante_int + 1;

            placajes_visitante.setText(placajes_visitante_int + "");
        }
    }

    public void clicksumar_ensayoscastigo_local(View view) {

        if (ensayoscastigo_local_int < 100) {
            ensayoscastigo_local_int = ensayoscastigo_local_int + 1;

            ensayoscastigo_local.setText(ensayoscastigo_local_int + "");
        }
    }

    public void clicksumar_ensayoscastigo_visitante(View view) {

        if (ensayoscastigo_visitante_int < 100) {
            ensayoscastigo_visitante_int = ensayoscastigo_visitante_int + 1;

            ensayoscastigo_visitante.setText(ensayoscastigo_visitante_int + "");
        }
    }

    public void clicksumar_avant_local(View view) {

        if (avant_local_int < 100) {
            avant_local_int = avant_local_int + 1;

            avant_local.setText(avant_local_int + "");
        }
    }

    public void clicksumar_avant_visitante(View view) {

        if (avant_visitante_int < 100) {
            avant_visitante_int = avant_visitante_int + 1;

            avant_visitante.setText(avant_visitante_int + "");
        }
    }

    public void clicksumar_agrupamientoganado_local(View view) {

        if (agrupamientosganados_local_int < 100) {
            agrupamientosganados_local_int = agrupamientosganados_local_int + 1;

            agrupamientosganados_local.setText(agrupamientosganados_local_int + "");
        }
    }

    public void clicksumar_agrupamientoganado_visitante(View view) {

        if (agrupamientosganados_visitante_int < 100) {
            agrupamientosganados_visitante_int = agrupamientosganados_visitante_int + 1;

            agrupamientosganados_visitante.setText(agrupamientosganados_visitante_int + "");
        }
    }

    public void clicksumar_drop_local(View view) {

        if (drop_local_int < 100) {
            drop_local_int = drop_local_int + 1;

            drop_local.setText(drop_local_int + "");
        }
    }

    public void clicksumar_drop_visitante(View view) {

        if (drop_visitante_int < 100) {
            drop_visitante_int = drop_visitante_int + 1;

            drop_visitante.setText(drop_visitante_int + "");
        }
    }

    public void clicksumar_agrupamientoperdido_local(View view) {

        if (agrupamientosperdidos_local_int < 100) {
            agrupamientosperdidos_local_int = agrupamientosperdidos_local_int + 1;

            agrupamientosperdidos_local.setText(agrupamientosperdidos_local_int + "");
        }
    }

    public void clicksumar_agrupamientoperdido_visitante(View view) {

        if (agrupamientosperdidos_visitante_int < 100) {
            agrupamientosperdidos_visitante_int = agrupamientosperdidos_visitante_int + 1;

            agrupamientosperdidos_visitante.setText(agrupamientosperdidos_visitante_int + "");
        }
    }

    public void clicksumar_recuperaciones_local(View view) {

        if (recuperaciones_local_int < 100) {
            recuperaciones_local_int = recuperaciones_local_int + 1;

            recuperaciones_local.setText(recuperaciones_local_int + "");
        }
    }

    public void clicksumar_recuperaciones_visitante(View view) {

        if (recuperaciones_visitante_int < 100) {
            recuperaciones_visitante_int = recuperaciones_visitante_int + 1;

            recuperaciones_visitante.setText(recuperaciones_visitante_int + "");
        }
    }

    public void clicksumar_juegoalpiepositivo_local(View view) {

        if (juegopositivo_local_int < 100) {
            juegopositivo_local_int = juegopositivo_local_int + 1;

            juegopositivo_local.setText(juegopositivo_local_int + "");
        }
    }

    public void clicksumar_juegoalpiepositivo_visitante(View view) {

        if (juegospositivo_visitante_int < 100) {
            juegospositivo_visitante_int = juegospositivo_visitante_int + 1;

            juegospositivo_visitante.setText(juegospositivo_visitante_int + "");
        }
    }

    public void clicksumar_juegoalpienegativo_local(View view) {

        if (juegonegativo_local_int < 100) {
            juegonegativo_local_int = juegonegativo_local_int + 1;

            juegonegativo_local.setText(juegonegativo_local_int + "");
        }
    }

    public void clicksumar_juegoalpienegativo_visitante(View view) {

        if (juegonegativo_visitante_int < 100) {
            juegonegativo_visitante_int = juegonegativo_visitante_int + 1;

            juegonegativo_visitante.setText(juegonegativo_visitante_int + "");
        }
    }

    public void clickestar_contrarucks_local(View view) {

        if (contrarucks_local_int > 0) {
            contrarucks_local_int = contrarucks_local_int - 1;

            contrarucks_local.setText(contrarucks_local_int + "");
        }
    }

    public void clickestar_contrarucks_visitante(View view) {

        if (contrarucks_visitante_int > 0) {
            contrarucks_visitante_int = contrarucks_visitante_int - 1;

            contrarucks_visitante.setText(contrarucks_visitante_int + "");
        }
    }

    public void clickestar_placajes_local(View view) {

        if (placajes_local_int > 0) {
            placajes_local_int = placajes_local_int - 1;

            placajes_local.setText(placajes_local_int + "");
        }
    }

    public void clickestar_placajes_visitante(View view) {

        if (placajes_visitante_int > 0) {
            placajes_visitante_int = placajes_visitante_int - 1;

            placajes_visitante.setText(placajes_visitante_int + "");
        }
    }

    public void clickestar_ensayoscastigo_local(View view) {

        if (ensayoscastigo_local_int > 0) {
            ensayoscastigo_local_int = ensayoscastigo_local_int - 1;

            ensayoscastigo_local.setText(ensayoscastigo_local_int + "");
        }
    }

    public void clickestar_ensayoscastigo_visitante(View view) {

        if (ensayoscastigo_visitante_int > 0) {
            ensayoscastigo_visitante_int = ensayoscastigo_visitante_int - 1;

            ensayoscastigo_visitante.setText(ensayoscastigo_visitante_int + "");
        }
    }

    public void clickestar_avant_local(View view) {

        if (avant_local_int > 0) {
            avant_local_int = avant_local_int - 1;

            avant_local.setText(avant_local_int + "");
        }
    }

    public void clickestar_avant_visitante(View view) {

        if (avant_visitante_int > 0) {
            avant_visitante_int = avant_visitante_int - 1;

            avant_visitante.setText(avant_visitante_int + "");
        }
    }

    public void clickestar_agrupamientoganado_local(View view) {

        if (agrupamientosganados_local_int > 0) {
            agrupamientosganados_local_int = agrupamientosganados_local_int - 1;

            agrupamientosganados_local.setText(agrupamientosganados_local_int + "");
        }
    }

    public void clickestar_agrupamientoganado_visitante(View view) {

        if (agrupamientosganados_visitante_int > 0) {
            agrupamientosganados_visitante_int = agrupamientosganados_visitante_int - 1;

            agrupamientosganados_visitante.setText(agrupamientosganados_visitante_int + "");
        }
    }

    public void clickestar_drop_local(View view) {

        if (drop_local_int > 0) {
            drop_local_int = drop_local_int - 1;

            drop_local.setText(drop_local_int + "");
        }
    }

    public void clickestar_drop_visitante(View view) {

        if (drop_visitante_int > 0) {
            drop_visitante_int = drop_visitante_int - 1;

            drop_visitante.setText(drop_visitante_int + "");
        }
    }

    public void clickestar_agrupamientoperdido_local(View view) {

        if (agrupamientosperdidos_local_int > 0) {
            agrupamientosperdidos_local_int = agrupamientosperdidos_local_int - 1;

            agrupamientosperdidos_local.setText(agrupamientosperdidos_local_int + "");
        }
    }

    public void clickestar_agrupamientoperdido_visitante(View view) {

        if (agrupamientosperdidos_visitante_int > 0) {
            agrupamientosperdidos_visitante_int = agrupamientosperdidos_visitante_int - 1;

            agrupamientosperdidos_visitante.setText(agrupamientosperdidos_visitante_int + "");
        }
    }

    public void clickestar_recuperaciones_local(View view) {

        if (recuperaciones_local_int > 0) {
            recuperaciones_local_int = recuperaciones_local_int - 1;

            recuperaciones_local.setText(recuperaciones_local_int + "");
        }
    }

    public void clickestar_recuperaciones_visitante(View view) {

        if (recuperaciones_visitante_int > 0) {
            recuperaciones_visitante_int = recuperaciones_visitante_int - 1;

            recuperaciones_visitante.setText(recuperaciones_visitante_int + "");
        }
    }

    public void clickestar_juegoalpiepositivo_local(View view) {

        if (juegopositivo_local_int > 0) {
            juegopositivo_local_int = juegopositivo_local_int - 1;

            juegopositivo_local.setText(juegopositivo_local_int + "");
        }
    }

    public void clickestar_juegoalpiepositivo_visitante(View view) {

        if (juegospositivo_visitante_int > 0) {
            juegospositivo_visitante_int = juegospositivo_visitante_int - 1;

            juegospositivo_visitante.setText(juegospositivo_visitante_int + "");
        }
    }

    public void clickestar_juegoalpienegativo_local(View view) {

        if (juegonegativo_local_int > 0) {
            juegonegativo_local_int = juegonegativo_local_int - 1;

            juegonegativo_local.setText(juegonegativo_local_int + "");
        }
    }

    public void clickestar_juegoalpienegativo_visitante(View view) {

        if (juegonegativo_visitante_int > 0) {
            juegonegativo_visitante_int = juegonegativo_visitante_int - 1;

            juegonegativo_visitante.setText(juegonegativo_visitante_int + "");
        }
    }






}
