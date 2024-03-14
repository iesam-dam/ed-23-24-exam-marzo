package com.iesam.ryanair.features.vuelos.data;

import com.iesam.ryanair.features.vuelos.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {

    VueloFileLocalDataSource vueloFileLocalDataSource;

    public VueloDataRepository(VueloFileLocalDataSource vueloFileLocalDataSource) {
        this.vueloFileLocalDataSource = vueloFileLocalDataSource;
    }


    @Override
    public void saveVuelo(Vuelo vuelo) {
        vueloFileLocalDataSource.save(vuelo);
    }

    @Override
    public Vuelo getVuelo(String vueloId) {
        return getVuelo(vueloId);
    }
}
