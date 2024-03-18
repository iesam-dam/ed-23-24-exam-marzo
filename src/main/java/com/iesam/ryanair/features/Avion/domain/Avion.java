package com.iesam.ryanair.features.Avion.domain;

public class Avion {
    private final String codigoAvion;
    private final String nombre;
    private final String apellidos;
    private final String asientos;

    public Avion(String codigoAvion, String nombre, String apellidos, String asientos) {
        this.codigoAvion = codigoAvion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asientos = asientos;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAsientos() {
        return asientos;
    }
}
