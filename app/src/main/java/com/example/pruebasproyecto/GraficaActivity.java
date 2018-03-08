package com.example.pruebasproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GraficaActivity extends AppCompatActivity {

    BarChart barchart;

    DatabaseReference dbRef;
    ValueEventListener valueEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica);

        barchart=(BarChart)findViewById(R.id.grafica);

        barchart.setDrawBarShadow(false);
        barchart.setDrawValueAboveBar(true);
        barchart.setPinchZoom(false);


        ArrayList<BarEntry> graficas = new ArrayList<>();

        graficas.add(new BarEntry(44f,0));
        graficas.add(new BarEntry(68f,1));
        graficas.add(new BarEntry(74f,2));
        graficas.add(new BarEntry(20f,3));
        graficas.add(new BarEntry(44f,4));
        graficas.add(new BarEntry(4f,5));

        BarDataSet bardataset = new BarDataSet(graficas,"Dates");
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);



        BarData barData = new BarData(bardataset);
        barData.setBarWidth(2f);

        barchart.setData(barData);


    }


}
