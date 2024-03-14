package com.iesam.ryanair.features.empleados.domain;

public class Empleado {

    public final String dni;
    public final String nombre;
    public final String apellidos;
    public final String cargo;

    public Empleado(String dni, String nombre, String apellidos, String cargo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }
}
