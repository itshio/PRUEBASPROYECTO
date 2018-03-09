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

            //barchart.setDrawBarShadow(false);
            barchart.setDrawValueAboveBar(true);
            //barchart.setPinchZoom(false);
            barchart.setDrawGridBackground(true);


            ArrayList<BarEntry> graficas = new ArrayList<>();


            graficas.add(new BarEntry(1,seriado.getMeleganada_local()));
            graficas.add(new BarEntry(2, seriado.getAgrupamientoganado_local()));
            graficas.add(new BarEntry(3, seriado.getAgrupamientoperdido_local()));
            graficas.add(new BarEntry(4, seriado.getAmarilla_local()));
            graficas.add(new BarEntry(5, seriado.getAvant_local()));
            graficas.add(new BarEntry(6, seriado.getContraruck_local()));
            graficas.add(new BarEntry(7, seriado.getGolpes_local()));
            graficas.add(new BarEntry(8, seriado.getEnsayoscastigo_local()));
            graficas.add(new BarEntry(9, seriado.getJuegoalpienegativo_local()));
            graficas.add(new BarEntry(10, seriado.getJuegoalpiepositivo_local()));
            graficas.add(new BarEntry(11, seriado.getMeleperdida_local()));
            graficas.add(new BarEntry(12, seriado.getTouchganada_local()));
            graficas.add(new BarEntry(13, seriado.getTouchperdida_local()));
            graficas.add(new BarEntry(14, seriado.getPlacajes_local()));
            graficas.add(new BarEntry(15, seriado.getRecuperaciones_local()));

            ArrayList<BarEntry> graficas_visitante = new ArrayList<>();


            graficas_visitante.add(new BarEntry(1, seriado.getMeleganada_visitante()));
            graficas_visitante.add(new BarEntry(2, seriado.getAgrupamientoganado_visitante()));
            graficas_visitante.add(new BarEntry(3, seriado.getAgrupamientoperdido_visitante()));
            graficas_visitante.add(new BarEntry(4, seriado.getAmarilla_visitante()));
            graficas_visitante.add(new BarEntry(5, seriado.getAvant_visitante()));
            graficas_visitante.add(new BarEntry(6, seriado.getContraruck_visitante()));
            graficas_visitante.add(new BarEntry(7, seriado.getGolpes_visitante()));
            graficas_visitante.add(new BarEntry(8, seriado.getEnsayocastigo_visitante()));
            graficas_visitante.add(new BarEntry(9, seriado.getJuegoalpienegativo_visitante()));
            graficas_visitante.add(new BarEntry(10, seriado.getJuegoalpiepositivo_visitante()));
            graficas_visitante.add(new BarEntry(11, seriado.getMeleperdida_visitante()));
            graficas_visitante.add(new BarEntry(12, seriado.getTouchganada_visitante()));
            graficas_visitante.add(new BarEntry(13, seriado.getTouchperdida_visitante()));
            graficas_visitante.add(new BarEntry(14, seriado.getPlacajes_visitante()));
            graficas_visitante.add(new BarEntry(15, seriado.getRecuperaciones_visitante()));


            BarDataSet bardataset = new BarDataSet(graficas, "Dates");
            bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

            BarDataSet bardataset_visitante = new BarDataSet(graficas_visitante, "Dates");
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
