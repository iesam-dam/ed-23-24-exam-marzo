package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    public final String Id;
    public final Avion avion;

    public final List<Tripulante> tripulantes;

    public final List<Pasajero> pasajeros;
    public final String fecha;
    public final String hora;
    public final String precio;
    public final String origen;
    public final String destino;

    public Vuelo(String id, Avion avion, List<Tripulante> tripulantes, List<Pasajero> pasajeros, String fecha, String hora, String precio, String origen, String destino) {
        Id = id;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public String getId() {
        return Id;
    }

    public Avion getAvion() {
        return avion;
    }

    public List<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public List<Pasajero> getPasajeros() {
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
