package com.iesam.ryanair.features.pasajero.domain;

public class Pasajero {
    public final String Dni;
    public final String Nombre;
    public final String Apellido;
    public final String Localidad;
    public final String Provincia;

    public Pasajero(String dni, String nombre, String apellido, String localidad, String provincia) {
        Dni = dni;
        Nombre = nombre;
        Apellido = apellido;
        Localidad = localidad;
        Provincia = provincia;
    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public String getProvincia() {
        return Provincia;
    }
}
