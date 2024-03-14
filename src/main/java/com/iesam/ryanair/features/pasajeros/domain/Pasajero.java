package com.iesam.ryanair.features.pasajeros.domain;

public class Pasajero {
    public final String dni;
    public final String nombre;
    public final String apellidos;
    public final String localidad;
    public final String provincia;

    public Pasajero(String dni, String nombre, String apellidos, String localidad, String provincia) {
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
