package com.iesam.ryanair.features.aviones.domain;

public class Avion {
    public final int id;
    public final String nombre;
    public final String modelo;
    public final String asientos;

    public Avion(int id, String nombre, String modelo, String asientos) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.asientos = asientos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAsientos() {
        return asientos;
    }
}
