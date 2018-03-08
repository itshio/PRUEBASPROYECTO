package com.example.pruebasproyecto;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EstadisticaActivity extends AppCompatActivity {

    static final String EXTRA_ESTADISTICA = "FORMULARIO";

    ListView lv_fechas;

    DatabaseReference dbRef;
    ValueEventListener valueEventListener;

ArrayList<Resultado> lista_partidos= new ArrayList<Resultado>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);

        lv_fechas=(ListView)findViewById(R.id.stat_listview);

        cargardatosFirebase();



    }


    private void cargarListview (DataSnapshot dataSnapshot){

        lista_partidos.add(dataSnapshot.getValue(Resultado.class));

        Adaptador adaptador_empleado = new Adaptador(this,lista_partidos);
        lv_fechas.setAdapter(adaptador_empleado);






            }


    private void cargardatosFirebase (){

        dbRef = FirebaseDatabase.getInstance().getReference().child("parametros");

        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                lista_partidos.clear();
                for (DataSnapshot parametrosdatasnapchot: dataSnapshot.getChildren()){
                    cargarListview(parametrosdatasnapchot);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };




        dbRef.addValueEventListener(valueEventListener);

        lv_fechas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Resultado partido =((Resultado)parent.getItemAtPosition(position));
                Intent form_temporal = new Intent(getApplicationContext(),GraficaActivity.class);
                form_temporal.putExtra(EXTRA_ESTADISTICA,partido);
                startActivity(form_temporal);



            }
        });



    }

    public void click_temporal (View view){


        Intent form_temporal = new Intent(getApplicationContext(),GraficaActivity.class);
        startActivity(form_temporal);

    }


}
