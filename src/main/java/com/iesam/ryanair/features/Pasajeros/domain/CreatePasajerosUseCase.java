package com.iesam.ryanair.features.Pasajeros.domain;

import com.iesam.ryanair.features.Tripulantes.domain.TripulantesRepository;

public class CreatePasajerosUseCase {
    private final PasajerosRepository pasajerosRepository;

    public CreatePasajerosUseCase(PasajerosRepository pasajerosRepository) {
        this.pasajerosRepository = pasajerosRepository;
    }
    public void save(String dni){
        pasajerosRepository.savePasajeros();
    }
}
