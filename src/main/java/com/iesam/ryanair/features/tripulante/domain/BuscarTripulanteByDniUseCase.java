package com.iesam.ryanair.features.tripulante.domain;

import com.iesam.ryanair.features.tripulante.data.local.TripulanteMemLocalDataSource;

public class BuscarTripulanteByDniUseCase {
    TripulanteMemLocalDataSource tripulanteMemLocalDataSource;
    public Tripulante execute(String Dni){
      return tripulanteMemLocalDataSource.findById(Dni);
    }
}
