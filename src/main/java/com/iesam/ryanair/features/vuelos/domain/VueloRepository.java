package com.iesam.ryanair.features.vuelos.domain;

public interface VueloRepository {

    void saveVuelo(Vuelo vuelo);
    Vuelo getVuelo(String vueloId);
}
