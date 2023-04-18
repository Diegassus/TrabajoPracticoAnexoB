package com.example.trabajopracticoanexob;

import static android.app.PendingIntent.getActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import com.example.trabajopracticoanexob.models.Actividad;

import java.util.List;

public class ActivityAdapter extends ArrayAdapter<Actividad> {
    private Context context;
    private List<Actividad> lista ;
    private LayoutInflater li;


    public ActivityAdapter(@NonNull Context context, int resource, @NonNull List<Actividad> objects,LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = li.inflate(R.layout.item,parent,false);
        }
        Actividad actividad = lista.get(position);
        TextView tvNombre = itemView.findViewById(R.id.tvNombre);
        TextView tvFecha = itemView.findViewById(R.id.tvFecha);
        TextView tvHora = itemView.findViewById(R.id.tvHora);
        tvNombre.setText(actividad.getName());
        tvFecha.setText(actividad.getFecha());
        tvHora.setText(actividad.getHora());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre",actividad.getName());
                bundle.putString("fecha",actividad.getFecha());
                bundle.putString("hora",actividad.getHora());
                bundle.putString("descripcion",actividad.getDescription());
                bundle.putString("Lugar",actividad.getLugar());
                NavOptions op = new NavOptions.Builder()
                        .setLaunchSingleTop(true)
                        .setPopUpTo(R.id.itemFragment,true)
                        .build();
                Navigation.findNavController((Activity) context,R.id.nav_host_fragment_content_navigation).navigate(R.id.itemFragment,bundle,op);
            }
        });

        return itemView;
    }

    @Override
    public int getCount() {
        return  lista.size();
    }
}
