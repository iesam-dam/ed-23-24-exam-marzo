package com.iesam.ryanair.features.Tripulantes.domain;

public interface TripulantesRepository {
    Tripulantes obtainTripulantes(String cargo);

    void saveTripulantes();
}
