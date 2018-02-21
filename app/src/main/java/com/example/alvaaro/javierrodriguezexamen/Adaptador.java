package com.example.alvaaro.javierrodriguezexamen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Adaptador extends BaseAdapter{

    Context context;
    ArrayList<Pais> listaDatos;

    public Adaptador(Context context, ArrayList<Pais> listaDatos) {
        this.context = context;
        this.listaDatos = listaDatos;
    }

    @Override
    public int getCount() {
        return listaDatos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaDatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View vista = view;
        LayoutInflater inflate =LayoutInflater.from(context);
        vista = inflate.inflate(R.layout.pais, null);

        TextView tvNombre, tvNombreTraducido, tvClave, tvCapital, tvContinente, tvPoblacion, tvLatitud, tvLongitud, tvPaisesFronterizos;
        tvNombre = vista.findViewById(R.id.tvNombre);
        tvNombreTraducido = vista.findViewById(R.id.tvNombreTraducido);
        tvClave = vista.findViewById(R.id.tvClave);
        tvCapital = vista.findViewById(R.id.tvCapital);
        tvContinente = vista.findViewById(R.id.tvContinente);
        tvPoblacion = vista.findViewById(R.id.tvPoblacion);
        tvLatitud = vista.findViewById(R.id.tvLatitud);
        tvLongitud = vista.findViewById(R.id.tvLongitud);
        tvPaisesFronterizos = vista.findViewById(R.id.tvPaisesFronterizos);

        // IMPRIMO LOS VALORES DEL ARRAY LIST

        tvNombre.setText(listaDatos.get(i).getNombre().toString());
        tvNombreTraducido.setText(listaDatos.get(i).getNombreTraducido().toString());
        tvClave.setText(listaDatos.get(i).getClave().toString());
        tvCapital.setText(listaDatos.get(i).getCapital().toString());
        tvContinente.setText(listaDatos.get(i).getContinente().toString());
        tvPoblacion.setText(listaDatos.get(i).getPoblacion().toString());
        tvLatitud.setText(String.valueOf(Double.parseDouble(listaDatos.get(i).getLatitud().toString())));
        tvLongitud.setText(String.valueOf((Double.parseDouble(listaDatos.get(i).getLongitud().toString()))));
        tvPaisesFronterizos.setText(listaDatos.get(i).getPaisesFronterizos().toString());


        return vista;
    }
}
