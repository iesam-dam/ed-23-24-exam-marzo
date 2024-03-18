package com.iesam.ryanair.features.Avion.data;

import com.iesam.ryanair.features.Avion.domain.Avion;
import com.iesam.ryanair.features.Avion.domain.AvionRepository;
import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;
import com.iesam.ryanair.features.Tripulantes.domain.TripulantesRepository;

public class AvionDataRepository implements AvionRepository {
    private AvionRepository avionRepository;

    public AvionDataRepository() {
        this.avionRepository = avionRepository;
    }

    public AvionRepository avionRepository() {
        return avionRepository;
    }


    @Override
    public void saveAvion(String codigoAvion) {

    }
}
