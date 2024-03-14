package com.iesam.ryanair.features.pasajero.presentation;

import com.iesam.ryanair.features.pasajero.domain.BuscarPasajeroByDniUseCase;
import com.iesam.ryanair.features.pasajero.domain.CreatePasajeroUseCase;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;

public class PasajeroPresentation {
    public static void create(Pasajero pasajero){
        CreatePasajeroUseCase createPasajeroUseCase = new CreatePasajeroUseCase();
        createPasajeroUseCase.execute(pasajero);
    }
    public static Pasajero get(String Dni){
        BuscarPasajeroByDniUseCase buscarPasajeroByDniUseCase = new BuscarPasajeroByDniUseCase();
      return    buscarPasajeroByDniUseCase.execute(Dni);
    }
}
