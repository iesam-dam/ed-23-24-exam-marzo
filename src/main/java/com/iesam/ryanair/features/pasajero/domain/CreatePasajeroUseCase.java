package com.iesam.ryanair.features.pasajero.domain;

import com.iesam.ryanair.features.pasajero.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.pasajero.data.local.PasajeroMemLocalDataSource;

public class CreatePasajeroUseCase {
    PasajeroFileLocalDataSource pasajeroFileLocalDataSource;;

    public void execute(Pasajero pasajero){
        pasajeroFileLocalDataSource.save(pasajero);
    }
}
