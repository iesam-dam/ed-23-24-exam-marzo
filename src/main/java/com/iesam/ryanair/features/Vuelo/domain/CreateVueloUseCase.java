package com.iesam.ryanair.features.Vuelo.domain;

import com.iesam.ryanair.features.Pasajeros.domain.PasajerosRepository;

public class CreateVueloUseCase {
    private final VueloRepository vueloRepository;

    public CreateVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public void save(String dni){
        vueloRepository.saveVuelo();
    }
}
