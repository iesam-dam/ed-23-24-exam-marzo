package com.iesam.ryanair.features.Vuelo.domain;

import com.iesam.ryanair.features.Pasajeros.domain.Pasajeros;

public interface VueloRepository {
    Vuelo obtainVuelo(String codigoVuelo);

    void saveVuelo();
}
