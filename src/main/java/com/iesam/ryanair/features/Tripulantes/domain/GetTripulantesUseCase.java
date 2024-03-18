package com.iesam.ryanair.features.Tripulantes.domain;

import com.iesam.ryanair.features.Tripulantes.data.TripulantesDataRepository;

public class GetTripulantesUseCase {

    private final TripulantesRepository tripulantesRepository;

    public GetTripulantesUseCase(TripulantesRepository tripulantesRepository) {
        this.tripulantesRepository = tripulantesRepository;
    }
    public Tripulantes obtain(String cargo){
        return tripulantesRepository.obtainTripulantes(cargo);
    }
}
