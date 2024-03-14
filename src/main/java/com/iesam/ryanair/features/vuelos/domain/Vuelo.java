package com.iesam.ryanair.features.vuelos.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.pasajeros.domain.Pasajero;

import java.util.ArrayList;

public class Vuelo {
    public final int cod;
    public final Avion avion;
    public final String tripulantes;
    public final ArrayList<Pasajero> pasajeros;
    public final String fecha;
    public final String hora;
    public final String precio;
    public final String origen;
    public final String destino;

    public Vuelo(int cod, Avion avion, String tripulantes, ArrayList<Pasajero> pasajeros, String fecha, String hora, String precio, String origen, String destino) {
        this.cod = cod;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public int getCod() {
        return cod;
    }

    public Avion getAvion() {
        return avion;
    }

    public String getTripulantes() {
        return tripulantes;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getPrecio() {
        return precio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
