package com.iesam.ryanair.features.Tripulantes.presentation;

import com.iesam.ryanair.features.Tripulantes.data.TripulantesDataRepository;
import com.iesam.ryanair.features.Tripulantes.domain.CreateTripulantesUseCase;
import com.iesam.ryanair.features.Tripulantes.domain.GetTripulantesUseCase;
import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;
public class MainTripulantes {
    public void saveTripulantes(Tripulantes tripulantes){
        CreateTripulantesUseCase createTripulantesUseCase= new CreateTripulantesUseCase(new TripulantesDataRepository());
        createTripulantesUseCase.save(tripulantes.getCargo());
    }
    public static Tripulantes obtainTripulantes(String dni){
        GetTripulantesUseCase getTripulantesUseCase= new GetTripulantesUseCase(new TripulantesDataRepository());
        return getTripulantesUseCase.obtain(dni);
    }
}
