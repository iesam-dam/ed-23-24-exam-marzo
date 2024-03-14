package com.iesam.ryanair.features.pasajeros.data;

import com.iesam.ryanair.features.aviones.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.pasajeros.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.pasajeros.domain.Pasajero;
import com.iesam.ryanair.features.pasajeros.domain.PasajeroRepository;

public class PasajeroDataRepository implements PasajeroRepository {

    PasajeroFileLocalDataSource pasajeroFileLocalDataSource;

    public PasajeroDataRepository(PasajeroFileLocalDataSource pasajeroFileLocalDataSource) {
        this.pasajeroFileLocalDataSource = pasajeroFileLocalDataSource;
    }


    @Override
    public void savePasajero(Pasajero pasajero) {
        pasajeroFileLocalDataSource.save(pasajero);
    }
}
