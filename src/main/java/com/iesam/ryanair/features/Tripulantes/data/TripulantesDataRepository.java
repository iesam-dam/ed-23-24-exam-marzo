package com.iesam.ryanair.features.Tripulantes.data;

import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;
import com.iesam.ryanair.features.Tripulantes.domain.TripulantesRepository;

public class TripulantesDataRepository implements TripulantesRepository{

    private TripulantesRepository tripulantesRepository;

    public TripulantesDataRepository() {
        this.tripulantesRepository = tripulantesRepository;
    }

    public TripulantesRepository getTripulantesRepository() {
        return tripulantesRepository;
    }

    @Override
    public Tripulantes obtainTripulantes(String cargo) {
        return null;
    }

    @Override
    public void saveTripulantes() {

    }
}
