package com.iesam.ryanair.features.tripulante.presentation;

import com.iesam.ryanair.features.tripulante.domain.BuscarTripulanteByDniUseCase;
import com.iesam.ryanair.features.tripulante.domain.CreateTripulanteUseCase;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

public class TripulantePresentation {

    public static void create(Tripulante tripulante){
        CreateTripulanteUseCase createTripulanteUseCase = new CreateTripulanteUseCase();
        createTripulanteUseCase.execute(tripulante);
    }
    public static Tripulante get(String Dni){
        BuscarTripulanteByDniUseCase buscarTripulanteByDniUseCase = new BuscarTripulanteByDniUseCase();
       return buscarTripulanteByDniUseCase.execute(Dni);

    }
}
