package com.example.pruebasproyecto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class FormularioActivity extends AppCompatActivity {

    static final String EXTRA_FORMULARIO = "FORMULARIO";
    Button iniciarjugado,pausarjugado,iniciarreal,pausarreal;
    Chronometer jugado,real;
    long time=0;
    TextView meleganada_local,meleganada_visitante,resultado_local,resultado_visitante,touchganada_local,touchperdida_local,
            meleperdida_local,meleperdida_visitante,touchperdida_visitante,touchganada_visitante,golpes_local,golpes_visitante,
            amarilla_local,amarilla_visitante,roja_local,roja_visitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        jugado = (Chronometer) findViewById(R.id.formu_crono_jugado);
        real = (Chronometer)findViewById(R.id.formu_crono_real);

        iniciarjugado = (Button)findViewById(R.id.formu_btniniciar_jugado);
        pausarjugado = (Button)findViewById(R.id.formu_btnpausar_jugado);
        iniciarreal = (Button)findViewById(R.id.formu_btniniciar_real);
        pausarreal = (Button)findViewById(R.id.formu_btnpausar_real);

        meleganada_local = (TextView)findViewById(R.id.formu_meleganada_local);
        meleganada_visitante = (TextView)findViewById(R.id.formu_meleganada_visitante);
        meleperdida_local = (TextView)findViewById(R.id.formu_meleperdida_local);
        meleperdida_visitante = (TextView)findViewById(R.id.formu_meleperdida_visitante);
        touchganada_local = (TextView)findViewById(R.id.formu_touchganada_local);
        touchganada_visitante = (TextView)findViewById(R.id.formu_touchganada_visitante);
        touchperdida_local = (TextView)findViewById(R.id.formu_touchperdida_local);
        touchperdida_visitante = (TextView)findViewById(R.id.formu_touchperdida_visitante);
        resultado_local = (TextView)findViewById(R.id.formu_resultado_local);
        resultado_visitante = (TextView)findViewById(R.id.formu_resultado_visitante);
        resultado_visitante = (TextView)findViewById(R.id.formu_resultado_visitante);
        golpes_local = (TextView)findViewById(R.id.formu_golpes_local);
        golpes_visitante = (TextView)findViewById(R.id.formu_golpes_visitante);
        amarilla_local = (TextView)findViewById(R.id.formu_amarilla_local);
        amarilla_visitante = (TextView)findViewById(R.id.formu_amarilla_visitante);
        roja_local = (TextView)findViewById(R.id.formu_rojas_local);
        roja_visitante = (TextView)findViewById(R.id.formu_roja_visitante);


    }

    public void click_iniciar_jugado (View view){

        iniciar(jugado);
    }

    public void click_pausar_jugado (View view) {

        pausar(jugado);
    }

    public void click_iniciar_real (View view){

        iniciar(real);
    }

    public void click_pausar_real (View view){

        pausar(real);
    }

    public void click_avanzada (View view){

        Intent form_avanzada = new Intent(getApplicationContext(),AvanzadaActivity.class);
        startActivity(form_avanzada);

    }

    public void click_guardar (View view){


        Intent form_guardar = new Intent (getApplicationContext(),EstadisticaActivity.class);
        startActivity(form_guardar);

    }

    private void iniciar (Chronometer chronometer){

        chronometer.start();
    }

    private void pausar (Chronometer chronometer){

        chronometer.stop();

    }
}
