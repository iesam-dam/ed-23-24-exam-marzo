package com.iesam.ryanair.features.pasajeros.presentation;

import com.iesam.ryanair.features.pasajeros.data.PasajeroDataRepository;
import com.iesam.ryanair.features.pasajeros.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.pasajeros.domain.Pasajero;
import com.iesam.ryanair.features.pasajeros.domain.SavePasajeroUseCase;

public class PasajeroPresentation {

    public static void save(Pasajero pasajero){
        SavePasajeroUseCase savePasajeroUseCase= new SavePasajeroUseCase(
                new PasajeroDataRepository(new PasajeroFileLocalDataSource()));
        savePasajeroUseCase.execute(pasajero);
    }
}
