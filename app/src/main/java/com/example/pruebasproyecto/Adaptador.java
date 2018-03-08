package com.example.pruebasproyecto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 08/03/2018.
 */

public class Adaptador extends ArrayAdapter<Resultado> {

    ArrayList<Resultado> clasereserva;
    Context c;

    public Adaptador(Context c, ArrayList<Resultado> reservado) {

        super(c, R.layout.item_listview, reservado);
        this.c = c;
        this.clasereserva = reservado;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_listview, null);


        TextView tv_fecha = (TextView) item.findViewById(R.id.item_fecha);
        tv_fecha.setText(clasereserva.get(position).getFecha()+"");


        TextView tv_equipolocal = (TextView) item.findViewById(R.id.item_local);
        tv_equipolocal.setText(clasereserva.get(position).getEquipo_local());

        TextView tv_equipovisitante = (TextView) item.findViewById(R.id.item_visitante);
        tv_equipovisitante.setText(clasereserva.get(position).getEquipo_visitante());


        return item;
    }
}
