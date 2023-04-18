package com.example.trabajopracticoanexob.models;

import java.io.Serializable;
import java.sql.Date;

public class Actividad implements Serializable {
    private String name;
    private String description;
    private String fecha;
    private String hora;
    private String lugar;

    public Actividad(String name, String description, String fecha, String hora, String lugar) {
        this.name = name;
        this.description = description;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
