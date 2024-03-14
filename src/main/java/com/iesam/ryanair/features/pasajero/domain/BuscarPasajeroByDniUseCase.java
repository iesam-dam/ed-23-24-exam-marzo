package com.iesam.ryanair.features.pasajero.domain;

import com.iesam.ryanair.features.pasajero.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.pasajero.data.local.PasajeroMemLocalDataSource;

public class BuscarPasajeroByDniUseCase {
    PasajeroFileLocalDataSource pasajeroFileLocalDataSource;
    public Pasajero execute(String Dni){
      return   pasajeroFileLocalDataSource.findById(Dni);
    }
}
