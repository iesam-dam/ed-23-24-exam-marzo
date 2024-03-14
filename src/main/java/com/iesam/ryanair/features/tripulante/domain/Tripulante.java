package com.iesam.ryanair.features.tripulante.domain;

public class Tripulante {
    public final String Dni;
    public final String Nombre;
    public final String Apellido;
    public final String Cargo;

    public Tripulante(String dni, String nombre, String apellido, String cargo) {
        Dni = dni;
        Nombre = nombre;
        Apellido = apellido;
        Cargo = cargo;
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

    public String getCargo() {
        return Cargo;
    }
}
