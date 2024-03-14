package com.iesam.ryanair.features.aviones.data;

import com.iesam.ryanair.features.aviones.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {

    AvionFileLocalDataSource avionFileLocalDataSource;

    public AvionDataRepository(AvionFileLocalDataSource avionFileLocalDataSource) {
        this.avionFileLocalDataSource = avionFileLocalDataSource;
    }


    @Override
    public void saveAvion(Avion avion) {
        avionFileLocalDataSource.save(avion);
    }

    @Override
    public Avion getAvion(String avionId) {
        return getAvion(avionId);
    }

}
