package com.iesam.ryanair.features.avion.domain;

public class Avion {
    public final String Id;
    public final String Nombre;
    public final String Modelo;
    public final Integer Asientos;

    public Avion(String id, String nombre, String modelo, Integer asientos) {
        Id = id;
        Nombre = nombre;
        Modelo = modelo;
        Asientos = asientos;
    }

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public Integer getAsientos() {
        return Asientos;
    }
}
