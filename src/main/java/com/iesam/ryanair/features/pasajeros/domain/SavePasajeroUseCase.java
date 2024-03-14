package com.iesam.ryanair.features.pasajeros.domain;

public class SavePasajeroUseCase {

    private PasajeroRepository pasajeroRepository;

    public SavePasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public void execute(Pasajero pasajero){
        this.pasajeroRepository.savePasajero(pasajero);
    }
}
