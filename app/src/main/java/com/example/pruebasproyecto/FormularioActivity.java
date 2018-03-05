package com.example.pruebasproyecto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class FormularioActivity extends AppCompatActivity {

    static final String EXTRA_FORMULARIO = "FORMULARIO";
    Button iniciarjugado,pausarjugado,iniciarreal,pausarreal;
    Chronometer jugado,real;
    long time=0;
    TextView meleganada_local,meleganada_visitante,resultado_local,resultado_visitante,touchganada_local,touchperdida_local,
            meleperdida_local,meleperdida_visitante,touchperdida_visitante,touchganada_visitante,golpes_local,golpes_visitante,
            amarilla_local,amarilla_visitante,roja_local,roja_visitante;
    EditText fecha,equipo_local,equipo_visitante;

    Spinner result_local,result_visitante;

    int meleganada_local_int;
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
    String equipo_visitante_int;


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
        golpes_local = (TextView)findViewById(R.id.formu_golpes_local);
        golpes_visitante = (TextView)findViewById(R.id.formu_golpes_visitante);
        amarilla_local = (TextView)findViewById(R.id.formu_amarilla_local);
        amarilla_visitante = (TextView)findViewById(R.id.formu_amarilla_visitante);
        roja_local = (TextView)findViewById(R.id.formu_rojas_local);
        roja_visitante = (TextView)findViewById(R.id.formu_roja_visitante);

        fecha= (EditText)findViewById(R.id.formu_fecha);
        equipo_local= (EditText)findViewById(R.id.formulario_Et_equipolocal);
        equipo_visitante= (EditText)findViewById(R.id.formulario_Et_equipovisitante);

        result_local=(Spinner)findViewById(R.id.formusp_resultado_local);
        result_visitante=(Spinner)findViewById(R.id.formusp_resultado_visitante);

        String [] local = {"5","2","3"};
        ArrayAdapter<String> adaptadorlocal = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,local);
        result_local.setAdapter(adaptadorlocal);

        String [] visitante = {"5","2","3"};
        ArrayAdapter<String> adaptadorvisitante = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,visitante);
        result_visitante.setAdapter(adaptadorvisitante);









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

    private void sumar (int parametro){

        if(parametro<100){
            parametro=parametro+1;

            }
    }

    public void clicksumar_meleganada_local (View view){



        if(meleganada_local_int<100){
            meleganada_local_int=meleganada_local_int+1;

            meleganada_local.setText(meleganada_local_int+"");}




    }

    public void clicksumar_meleganada_visitante (View view){



        if(meleganada_visitante_int<100){
            meleganada_visitante_int=meleganada_visitante_int+1;

            meleganada_visitante.setText(meleganada_visitante_int+"");}




    }
    public void clicksumar_meleperdia_local (View view){



        if(meleperdida_local_int<100){
            meleperdida_local_int=meleperdida_local_int+1;

            meleperdida_local.setText(meleperdida_local_int+"");}




    }
    public void clicksumar_meleperdida_visitante (View view){



        if(meleperdida_visitante_int<100){
            meleperdida_visitante_int=meleperdida_visitante_int+1;

            meleperdida_visitante.setText(meleperdida_visitante_int+"");}




    }
    public void clicksumar_touchganada_local (View view){



        if(touchganada_local_int<100){
            touchganada_local_int=touchganada_local_int+1;

            touchganada_local.setText(touchganada_local_int+"");}




    }
    public void clicksumar_touchganada_visitante (View view){



        if(touchganada_visitante_int<100){
            touchganada_visitante_int=touchganada_visitante_int+1;

            touchganada_visitante.setText(touchganada_visitante_int+"");}




    }
    public void clicksumar_touchperdida_local (View view){



        if(touchperdida_local_int<100){
            touchperdida_local_int=touchperdida_local_int+1;

            touchperdida_local.setText(touchperdida_local_int+"");}




    }
    public void clicksumar_touchperdida_visitante (View view){



        if(touchperdida_visitante_int<100){
            touchperdida_visitante_int=touchperdida_visitante_int+1;

            touchperdida_visitante.setText(touchperdida_visitante_int+"");}




    }
    public void clicksumar_resultado_local (View view){



       /* String resultadolocal_sumar= resultado_local.getText().toString();

        int local=Integer.parseInt(resultadolocal_sumar);
        int local_sumado= local+(result_local.getSelectedItem());
        resultado_local.setText(local_sumado+"");*/







    }
    public void clicksumar_resultado_visitante (View view){



        if(resultado_visitante_int<100){
            resultado_visitante_int=resultado_local_int+1;

            resultado_visitante.setText(resultado_visitante_int+"");}




    }
    public void clicksumar_golpes_local (View view){



        if(golpes_local_int<100){
            golpes_local_int=golpes_local_int+1;

            golpes_local.setText(golpes_local_int+"");}




    }
    public void clicksumar_golpes_visitantes (View view){



        if(golpes_visitante_int<100){
            golpes_visitante_int=golpes_visitante_int+1;

            golpes_visitante.setText(golpes_visitante_int+"");}




    }
    public void clicksumar_amarilla_local (View view){



        if(amarilla_local_int<100){
            amarilla_local_int=amarilla_local_int+1;

           amarilla_local.setText(amarilla_local_int+"");}




    }
    public void clicksumar_amarilla_visitante (View view){



        if(amarilla_visitante_int<100){
            amarilla_visitante_int=amarilla_visitante_int+1;

            amarilla_visitante.setText(amarilla_visitante_int+"");}




    }
    public void clicksumar_roja_local (View view){



        if(roja_local_int<100){
            roja_local_int=roja_local_int+1;

            roja_local.setText(roja_local_int+"");}




    }
    public void clicksumar_roja_visitante (View view){



        if(roja_visitante_int<100){
            roja_visitante_int=roja_visitante_int+1;

            roja_visitante.setText(roja_visitante_int+"");}




    }

    public void clickrestar_meleganada_visitante (View view){



        if(meleganada_visitante_int>0){
            meleganada_visitante_int=meleganada_visitante_int-1;

            meleganada_visitante.setText(meleganada_visitante_int+"");}




    }
    public void clickrestar_meleganada_local (View view){



        if(meleganada_local_int>0){
            meleganada_local_int=meleganada_local_int-1;

            meleganada_local.setText(meleganada_visitante_int+"");}




    }
    public void clickrestar_meleperdia_local (View view){



        if(meleperdida_local_int>0){
            meleperdida_local_int=meleperdida_local_int-1;

            meleperdida_local.setText(meleperdida_local_int+"");}




    }
    public void clickrestar_meleperdida_visitante (View view){



        if(meleperdida_visitante_int>0){
            meleperdida_visitante_int=meleperdida_visitante_int-1;

            meleperdida_visitante.setText(meleperdida_visitante_int+"");}




    }
    public void clickrestar_touchganada_local (View view){



        if(touchganada_local_int>0){
            touchganada_local_int=touchganada_local_int-1;

            touchganada_local.setText(touchganada_local_int+"");}




    }
    public void clickrestar_touchganada_visitante (View view){



        if(touchganada_visitante_int>0){
            touchganada_visitante_int=touchganada_visitante_int-1;

            touchganada_visitante.setText(touchganada_visitante_int+"");}




    }
    public void clickrestar_touchperdida_local (View view){



        if(touchperdida_local_int>0){
            touchperdida_local_int=touchperdida_local_int-1;

            touchperdida_local.setText(touchperdida_local_int+"");}




    }
    public void clickrestar_touchperdida_visitante (View view){



        if(touchperdida_visitante_int>0){
            touchperdida_visitante_int=touchperdida_visitante_int-1;

            touchperdida_visitante.setText(touchperdida_visitante_int+"");}




    }
    public void clickrestar_resultado_local (View view){



        if(resultado_local_int>0){
            resultado_local_int=resultado_local_int-1;

            resultado_local.setText(resultado_local_int+"");}




    }
    public void clickrestar_resultado_visitante (View view){



        if(resultado_visitante_int>0){
            resultado_visitante_int=resultado_local_int-1;

            resultado_visitante.setText(resultado_visitante_int+"");}




    }
    public void clickrestar_golpes_local (View view){



        if(golpes_local_int>0){
            golpes_local_int=golpes_local_int-1;

            golpes_local.setText(golpes_local_int+"");}




    }
    public void clickrestar_golpes_visitantes (View view){



        if(golpes_visitante_int>0){
            golpes_visitante_int=golpes_visitante_int-1;

            golpes_visitante.setText(golpes_visitante_int+"");}




    }
    public void clickrestar_amarilla_local (View view){



        if(amarilla_local_int>0){
            amarilla_local_int=amarilla_local_int-1;

            amarilla_local.setText(amarilla_local_int+"");}




    }
    public void clickrestar_amarilla_visitante (View view){



        if(amarilla_visitante_int>0){
            amarilla_visitante_int=amarilla_visitante_int-1;

            amarilla_visitante.setText(amarilla_visitante_int+"");}




    }
    public void clickrestar_roja_local (View view){



        if(roja_local_int>0){
            roja_local_int=roja_local_int-1;

            roja_local.setText(roja_local_int+"");}




    }
    public void clickrestar_roja_visitante (View view){



        if(roja_visitante_int>0){
            roja_visitante_int=roja_visitante_int-1;

            roja_visitante.setText(roja_visitante_int+"");}




    }





















}

