package com.iesam.ryanair.features.Tripulantes.domain;

public class CreateTripulantesUseCase {

    private final TripulantesRepository tripulantesRepository;

    public CreateTripulantesUseCase(TripulantesRepository tripulantesRepository) {
        this.tripulantesRepository = tripulantesRepository;
    }
    public void save(String dni){
        tripulantesRepository.saveTripulantes();
    }

}
