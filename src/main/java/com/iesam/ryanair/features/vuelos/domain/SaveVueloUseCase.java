package com.iesam.ryanair.features.vuelos.domain;

public class SaveVueloUseCase {

    private VueloRepository vueloRepository;

    public SaveVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public void execute(Vuelo vuelo){
        this.vueloRepository.saveVuelo(vuelo);
    }
}
