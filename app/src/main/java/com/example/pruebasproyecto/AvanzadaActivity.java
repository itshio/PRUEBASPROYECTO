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

    public void clicksumar_contrarucks_local (View view){

        if(contrarucks_local_int<100){
            contrarucks_local_int=contrarucks_local_int+1;

            contrarucks_local.setText(contrarucks_local_int+"");}
    }
    public void clicksumar_contrarucks_visitante (View view){

        if(contrarucks_visitante_int<100){
            contrarucks_visitante_int=contrarucks_visitante_int+1;

            contrarucks_visitante.setText(contrarucks_visitante_int+"");}
    }
    public void clicksumar_placajes_local (View view){

        if(placajes_local_int<100){
            placajes_local_int=placajes_local_int+1;

            placajes_local.setText(placajes_local_int+"");}
    }
    public void clicksumar_placajes_visitante (View view){

        if(placajes_visitante_int<100){
            placajes_visitante_int=placajes_visitante_int+1;

            placajes_visitante.setText(placajes_visitante_int+"");}
    }
    public void clicksumar_ensayoscastigo_local (View view){

        if(ensayoscastigo_local_int<100){
            ensayoscastigo_local_int=ensayoscastigo_local_int+1;

            ensayoscastigo_local.setText(ensayoscastigo_local_int+"");}
    }
    public void clicksumar_ensayoscastigo_visitante (View view){

        if(ensayoscastigo_visitante_int<100){
            ensayoscastigo_visitante_int=ensayoscastigo_visitante_int+1;

            ensayoscastigo_visitante.setText(ensayoscastigo_visitante_int+"");}
    }
    public void clicksumar_avant_local (View view){

        if(avant_local_int<100){
            avant_local_int=avant_local_int+1;

            avant_local.setText(avant_local_int+"");}
    }
    public void clicksumar_avant_visitante (View view){

        if(avant_visitante_int<100){
            avant_visitante_int=avant_visitante_int+1;

            avant_visitante.setText(avant_visitante_int+"");}
    }
    public void clicksumar_agrupamientoganado_local (View view){

        if(agrupamientosganados_local_int<100){
            agrupamientosganados_local_int=agrupamientosganados_local_int+1;

            agrupamientosganados_local.setText(agrupamientosganados_local_int+"");}
    }
    public void clicksumar_agrupamientoganado_visitante (View view){

        if(agrupamientosganados_visitante_int<100){
            agrupamientosganados_visitante_int=agrupamientosganados_visitante_int+1;

            agrupamientosganados_visitante.setText(agrupamientosganados_visitante_int+"");}
    }
    public void clicksumar_drop_local (View view){

        if(drop_local_int<100){
            drop_local_int=drop_local_int+1;

            drop_local.setText(drop_local_int+"");}
    }
    public void clicksumar_drop_visitante (View view){

        if(drop_visitante_int<100){
            drop_visitante_int=drop_visitante_int+1;

            drop_visitante.setText(drop_visitante_int+"");}
    }
    public void clicksumar_agrupamientoperdido_local (View view){

        if(agrupamientosperdidos_local_int<100){
            agrupamientosperdidos_local_int=agrupamientosperdidos_local_int+1;

            agrupamientosperdidos_local.setText(agrupamientosperdidos_local_int+"");}
    }
    public void clicksumar_agrupamientoperdido_visitante (View view){

        if(agrupamientosperdidos_visitante_int<100){
            agrupamientosperdidos_visitante_int=agrupamientosperdidos_visitante_int+1;

            agrupamientosperdidos_visitante.setText(agrupamientosperdidos_visitante_int+"");}
    }
    public void clicksumar_recuperaciones_local (View view){

        if(recuperaciones_local_int<100){
            recuperaciones_local_int=recuperaciones_local_int+1;

            recuperaciones_local.setText(recuperaciones_local_int+"");}
    }
    public void clicksumar_recuperaciones_visitante (View view){

        if(recuperaciones_visitante_int<100){
            recuperaciones_visitante_int=recuperaciones_visitante_int+1;

            recuperaciones_visitante.setText(recuperaciones_visitante_int+"");}
    }
    public void clicksumar_juegoalpiepositivo_local (View view){

        if(juegopositivo_local_int<100){
            juegopositivo_local_int=juegopositivo_local_int+1;

            juegopositivo_local.setText(juegopositivo_local_int+"");}
    }
    public void clicksumar_juegoalpiepositivo_visitante (View view){

        if(juegospositivo_visitante_int<100){
            juegospositivo_visitante_int=juegospositivo_visitante_int+1;

            juegospositivo_visitante.setText(juegospositivo_visitante_int+"");}
    }
    public void clicksumar_juegoalpienegativo_local (View view){

        if(juegonegativo_local_int<100){
            juegonegativo_local_int=juegonegativo_local_int+1;

            juegonegativo_local.setText(juegonegativo_local_int+"");}
    }
    public void clicksumar_juegoalpienegativo_visitante (View view){

        if(juegonegativo_visitante_int<100){
            juegonegativo_visitante_int=juegonegativo_visitante_int+1;

            juegonegativo_visitante.setText(juegonegativo_visitante_int+"");}
    }

    public void clickestar_contrarucks_local (View view){

        if(contrarucks_local_int>0){
            contrarucks_local_int=contrarucks_local_int-1;

            contrarucks_local.setText(contrarucks_local_int+"");}
    }
    public void clickestar_contrarucks_visitante (View view){

        if(contrarucks_visitante_int>0){
            contrarucks_visitante_int=contrarucks_visitante_int-1;

            contrarucks_visitante.setText(contrarucks_visitante_int+"");}
    }
    public void clickestar_placajes_local (View view){

        if(placajes_local_int>0){
            placajes_local_int=placajes_local_int-1;

            placajes_local.setText(placajes_local_int+"");}
    }
    public void clickestar_placajes_visitante (View view){

        if(placajes_visitante_int>0){
            placajes_visitante_int=placajes_visitante_int-1;

            placajes_visitante.setText(placajes_visitante_int+"");}
    }
    public void clickestar_ensayoscastigo_local (View view){

        if(ensayoscastigo_local_int>0){
            ensayoscastigo_local_int=ensayoscastigo_local_int-1;

            ensayoscastigo_local.setText(ensayoscastigo_local_int+"");}
    }
    public void clickestar_ensayoscastigo_visitante (View view){

        if(ensayoscastigo_visitante_int>0){
            ensayoscastigo_visitante_int=ensayoscastigo_visitante_int-1;

            ensayoscastigo_visitante.setText(ensayoscastigo_visitante_int+"");}
    }
    public void clickestar_avant_local (View view){

        if(avant_local_int>0){
            avant_local_int=avant_local_int-1;

            avant_local.setText(avant_local_int+"");}
    }
    public void clickestar_avant_visitante (View view){

        if(avant_visitante_int>0){
            avant_visitante_int=avant_visitante_int-1;

            avant_visitante.setText(avant_visitante_int+"");}
    }
    public void clickestar_agrupamientoganado_local (View view){

        if(agrupamientosganados_local_int>0){
            agrupamientosganados_local_int=agrupamientosganados_local_int-1;

            agrupamientosganados_local.setText(agrupamientosganados_local_int+"");}
    }
    public void clickestar_agrupamientoganado_visitante (View view){

        if(agrupamientosganados_visitante_int>0){
            agrupamientosganados_visitante_int=agrupamientosganados_visitante_int-1;

            agrupamientosganados_visitante.setText(agrupamientosganados_visitante_int+"");}
    }
    public void clickestar_drop_local (View view){

        if(drop_local_int>0){
            drop_local_int=drop_local_int-1;

            drop_local.setText(drop_local_int+"");}
    }
    public void clickestar_drop_visitante (View view){

        if(drop_visitante_int>0){
            drop_visitante_int=drop_visitante_int-1;

            drop_visitante.setText(drop_visitante_int+"");}
    }
    public void clickestar_agrupamientoperdido_local (View view){

        if(agrupamientosperdidos_local_int>0){
            agrupamientosperdidos_local_int=agrupamientosperdidos_local_int-1;

            agrupamientosperdidos_local.setText(agrupamientosperdidos_local_int+"");}
    }
    public void clickestar_agrupamientoperdido_visitante (View view){

        if(agrupamientosperdidos_visitante_int>0){
            agrupamientosperdidos_visitante_int=agrupamientosperdidos_visitante_int-1;

            agrupamientosperdidos_visitante.setText(agrupamientosperdidos_visitante_int+"");}
    }
    public void clickestar_recuperaciones_local (View view){

        if(recuperaciones_local_int>0){
            recuperaciones_local_int=recuperaciones_local_int-1;

            recuperaciones_local.setText(recuperaciones_local_int+"");}
    }
    public void clickestar_recuperaciones_visitante (View view){

        if(recuperaciones_visitante_int>0){
            recuperaciones_visitante_int=recuperaciones_visitante_int-1;

            recuperaciones_visitante.setText(recuperaciones_visitante_int+"");}
    }
    public void clickestar_juegoalpiepositivo_local (View view){

        if(juegopositivo_local_int>0){
            juegopositivo_local_int=juegopositivo_local_int-1;

            juegopositivo_local.setText(juegopositivo_local_int+"");}
    }
    public void clickestar_juegoalpiepositivo_visitante (View view){

        if(juegospositivo_visitante_int>0){
            juegospositivo_visitante_int=juegospositivo_visitante_int-1;

            juegospositivo_visitante.setText(juegospositivo_visitante_int+"");}
    }
    public void clickestar_juegoalpienegativo_local (View view){

        if(juegonegativo_local_int>0){
            juegonegativo_local_int=juegonegativo_local_int-1;

            juegonegativo_local.setText(juegonegativo_local_int+"");}
    }
    public void clickestar_juegoalpienegativo_visitante (View view){

        if(juegonegativo_visitante_int>0){
            juegonegativo_visitante_int=juegonegativo_visitante_int-1;

            juegonegativo_visitante.setText(juegonegativo_visitante_int+"");}
    }





}
