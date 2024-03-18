package com.iesam.ryanair.features.Vuelo.domain;

import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;
import com.iesam.ryanair.features.Tripulantes.domain.TripulantesRepository;

public class GetVueloUseCase {
    private final VueloRepository vueloRepository;

    public GetVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public Vuelo obtain(String codigoVuelo){
        return vueloRepository.obtainVuelo(codigoVuelo);
    }
}
