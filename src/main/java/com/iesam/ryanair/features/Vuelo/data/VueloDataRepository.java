package com.iesam.ryanair.features.Vuelo.data;

import com.iesam.ryanair.features.Vuelo.domain.Vuelo;
import com.iesam.ryanair.features.Vuelo.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {
    private VueloRepository vueloRepository;

    public VueloDataRepository() {
        this.vueloRepository = vueloRepository;
    }

    public VueloRepository getVueloRepository() {
        return vueloRepository;
    }

    @Override
    public Vuelo obtainVuelo(String codigoVuelo) {
        return vueloRepository.obtainVuelo(codigoVuelo);
    }

    @Override
    public void saveVuelo() {
    }
}
