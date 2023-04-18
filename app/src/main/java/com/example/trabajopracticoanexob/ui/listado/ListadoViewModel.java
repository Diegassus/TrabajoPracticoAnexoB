package com.example.trabajopracticoanexob.ui.listado;

import android.app.Activity;
import android.widget.ListView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajopracticoanexob.models.Actividad;

import java.sql.Date;
import java.util.ArrayList;

public class ListadoViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Actividad>> actividades;

    public LiveData<ArrayList<Actividad>> getActividades() {
        if (actividades == null) {
            actividades = new MutableLiveData<>();
        }
        return actividades;
    }

    public ListadoViewModel() {

    }

    public void crearActividades(){
        ArrayList<Actividad> activ = new ArrayList<>();
        activ.add(new Actividad("Visitar la ULP", "Ir hasta la ulp para decirle a lucho que los tp con maps cuestan", "15/05/2023","15:30" , "Universidad de La Punta"));
        activ.add(new Actividad("Comer papitas", "Comprar en el chino papas", "18/04/2023","20:30" , "Casa"));
        activ.add(new Actividad("Terminar la app", "Entregar esta app de mejor forma que la anterior", "18/04/2023","23:50" , "Aula Virtual"));

        actividades.setValue(activ);
    }
}