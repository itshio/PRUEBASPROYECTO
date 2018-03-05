package com.example.pruebasproyecto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AvanzadaActivity extends AppCompatActivity {

    TextView agrupamientosganados_local,agrupamientosganados_visitante, agrupamientosperdidos_local, agrupamientosperdidos_visitante, avant_local
            ,avant_visitante,recuperaciones_local,recuperaciones_visitante, placajes_local,placajes_visitante,contrarucks_local, contrarucks_visitante,drop_local,drop_visitante,ensayoscastigo_local,ensayoscastigo_visitante,
            juegopositivo_local,juegospositivo_visitante,juegonegativo_local,juegonegativo_visitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanzada);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        agrupamientosganados_local=(TextView)findViewById(R.id.agrupamientoganado_local);
        agrupamientosganados_visitante=(TextView)findViewById(R.id.agrupamientoganado_visitante);
        agrupamientosperdidos_local=(TextView)findViewById(R.id.agrupamientoperdido_local);
        agrupamientosperdidos_visitante=(TextView)findViewById(R.id.agrupamientoganado_visitante);
        avant_local=(TextView)findViewById(R.id.avant_local);
        avant_visitante=(TextView)findViewById(R.id.avant_visitante);
        recuperaciones_local=(TextView)findViewById(R.id.recuperaciones_local);
        recuperaciones_visitante=(TextView)findViewById(R.id.recuperaciones_visitante);
        placajes_local=(TextView)findViewById(R.id.placajes_local);
        placajes_visitante=(TextView)findViewById(R.id.placajes_visitante);
        contrarucks_local=(TextView)findViewById(R.id.avanzada_contrarucks_local);
        contrarucks_visitante=(TextView)findViewById(R.id.avanzada_contrarucks_visitante);
        drop_local=(TextView)findViewById(R.id.drop_local);
        drop_visitante=(TextView)findViewById(R.id.drop_visitante);
        ensayoscastigo_local=(TextView)findViewById(R.id.ensayos_local);
        juegonegativo_local=(TextView)findViewById(R.id.juegonegativo_local);
        juegonegativo_visitante=(TextView)findViewById(R.id.juegoperdido_visitante);
        juegopositivo_local=(TextView)findViewById(R.id.juegopositivo_local);
        juegospositivo_visitante=(TextView)findViewById(R.id.juegopositivo_visitante);


    }

    public void click_atras (View view) {


        Intent form_atras = new Intent(getApplicationContext(),FormularioActivity.class);
        startActivity(form_atras);
    }
}
