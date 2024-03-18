package com.iesam.ryanair.features.Vuelo.domain;

import com.iesam.ryanair.features.Avion.domain.Avion;
import com.iesam.ryanair.features.Pasajeros.domain.Pasajeros;
import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;

public class Vuelo {
    private final String codigoVuelo;
    private final Avion avion;
    private final Tripulantes tripulantes;
    private final Pasajeros pasajeros;
    private final String fecha;
    private final String horaVuelo;
    private final String precio;
    private final String origen;
    private final String destino;


    public Vuelo(String codigoVuelo, Avion avion, Tripulantes tripulantes, Pasajeros pasajeros, String fecha, String horaVuelo, String precio, String origen, String destino) {
        this.codigoVuelo = codigoVuelo;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.horaVuelo = horaVuelo;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public Tripulantes getTripulantes() {
        return tripulantes;
    }

    public Pasajeros getPasajeros() {
        return pasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraVuelo() {
        return horaVuelo;
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
