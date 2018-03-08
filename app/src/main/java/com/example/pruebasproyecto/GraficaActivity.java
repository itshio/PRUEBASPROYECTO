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

        barchart = (BarChart) findViewById(R.id.grafica);

        Bundle bundlist = getIntent().getExtras();
        if (bundlist != null) {

            Resultado seriado = bundlist.getParcelable(EstadisticaActivity.EXTRA_ESTADISTICA);

            barchart.setDrawBarShadow(false);
            barchart.setDrawValueAboveBar(true);
            barchart.setPinchZoom(false);


            ArrayList<BarEntry> graficas = new ArrayList<>();


            graficas.add(new BarEntry(seriado.getMeleganada_local(), 2));
            graficas.add(new BarEntry(seriado.getAgrupamientoganado_local(), 3));
            graficas.add(new BarEntry(seriado.getAgrupamientoperdido_local(), 4));
            graficas.add(new BarEntry(seriado.getAmarilla_local(), 5));
            graficas.add(new BarEntry(seriado.getAvant_local(), 6));
            graficas.add(new BarEntry(seriado.getContraruck_local(), 7));
            graficas.add(new BarEntry(seriado.getGolpes_local(), 8));
            graficas.add(new BarEntry(seriado.getEnsayoscastigo_local(), 9));
            graficas.add(new BarEntry(seriado.getJuegoalpienegativo_local(), 10));
            graficas.add(new BarEntry(seriado.getJuegoalpiepositivo_local(), 11));
            graficas.add(new BarEntry(seriado.getMeleperdida_local(), 12));
            graficas.add(new BarEntry(seriado.getTouchganada_local(), 13));
            graficas.add(new BarEntry(seriado.getTouchperdida_local(), 14));
            graficas.add(new BarEntry(seriado.getPlacajes_local(), 15));
            graficas.add(new BarEntry(seriado.getRecuperaciones_local(), 16));

            ArrayList<BarEntry> graficas_visitante = new ArrayList<>();


            graficas_visitante.add(new BarEntry(seriado.getMeleganada_visitante(), 2));
            graficas_visitante.add(new BarEntry(seriado.getAgrupamientoganado_visitante(), 3));
            graficas_visitante.add(new BarEntry(seriado.getAgrupamientoperdido_visitante(), 4));
            graficas_visitante.add(new BarEntry(seriado.getAmarilla_visitante(), 5));
            graficas_visitante.add(new BarEntry(seriado.getAvant_visitante(), 6));
            graficas_visitante.add(new BarEntry(seriado.getContraruck_visitante(), 7));
            graficas_visitante.add(new BarEntry(seriado.getGolpes_visitante(), 8));
            graficas_visitante.add(new BarEntry(seriado.getEnsayocastigo_visitante(), 9));
            graficas_visitante.add(new BarEntry(seriado.getJuegoalpienegativo_visitante(), 10));
            graficas_visitante.add(new BarEntry(seriado.getJuegoalpiepositivo_visitante(), 11));
            graficas_visitante.add(new BarEntry(seriado.getMeleperdida_visitante(), 12));
            graficas_visitante.add(new BarEntry(seriado.getTouchganada_visitante(), 13));
            graficas_visitante.add(new BarEntry(seriado.getTouchperdida_visitante(), 14));
            graficas_visitante.add(new BarEntry(seriado.getPlacajes_visitante(), 15));
            graficas_visitante.add(new BarEntry(seriado.getRecuperaciones_visitante(), 16));


            BarDataSet bardataset = new BarDataSet(graficas, "Dates");
            bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

            BarDataSet bardataset_visitante = new BarDataSet(graficas, "Dates");
            bardataset_visitante.setColors(ColorTemplate.COLORFUL_COLORS);


            BarData barData = new BarData(bardataset,bardataset_visitante);

            float groupSpace = 0.1f;
            float barSpace = 0.02f;
            float barWidth = 0.43f;

            barchart.setData(barData);


            barData.setBarWidth(barWidth);
            barchart.groupBars(1,groupSpace,barSpace);




        }


    }
}
