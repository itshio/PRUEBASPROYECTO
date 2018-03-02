package com.example.pruebasproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FormularioActivity extends AppCompatActivity {

    static final String EXTRA_FORMULARIO = "FORMULARIO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void click_avanzada (View view){

        Intent form_avanzada = new Intent(getApplicationContext(),AvanzadaActivity.class);
        startActivity(form_avanzada);

    }

    public void click_guardar (View view){


        Intent form_guardar = new Intent (getApplicationContext(),EstadisticaActivity.class);
        startActivity(form_guardar);

    }
}
