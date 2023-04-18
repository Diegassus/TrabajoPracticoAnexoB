package com.example.trabajopracticoanexob;

import static android.app.PendingIntent.getActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import com.example.trabajopracticoanexob.models.Actividad;

public class Dialogo {
    public static void mostratDialogo(Context context){
        new AlertDialog.Builder(context)
                .setTitle("Atencion!")
                .setMessage("Usted esta por abandonar una aplicacion epica. ¿Estas seguro?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Activity act = (Activity) context;
                        act.finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Seguimos entonces :)", Toast.LENGTH_LONG).show();
                    }
                }).show();
    }
}
