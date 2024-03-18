package com.iesam.ryanair.features.Pasajeros.domain;

public class Pasajeros {
    private final String dni;
    private final String nombre;
    private final String apellidos;
    private final String localidad;
    private final String provincia;

    public Pasajeros(String dni, String nombre, String apellidos, String localidad, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }
}
