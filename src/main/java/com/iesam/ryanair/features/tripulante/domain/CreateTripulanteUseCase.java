package com.iesam.ryanair.features.tripulante.domain;

import com.iesam.ryanair.features.tripulante.data.local.TripulanteMemLocalDataSource;

public class CreateTripulanteUseCase {
    TripulanteMemLocalDataSource tripulanteMemLocalDataSource;

    public void execute(Tripulante tripulante){
        tripulanteMemLocalDataSource.save(tripulante);
    }
}
