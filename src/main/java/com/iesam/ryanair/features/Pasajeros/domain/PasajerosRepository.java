package com.iesam.ryanair.features.Pasajeros.domain;

public interface PasajerosRepository {
    Pasajeros  obtainPasajeros(String dni);

    void savePasajeros();
}
