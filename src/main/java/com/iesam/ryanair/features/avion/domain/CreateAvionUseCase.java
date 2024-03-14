package com.iesam.ryanair.features.avion.domain;

import com.iesam.ryanair.features.avion.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.avion.data.local.AvionMemLocalDataSource;

public class CreateAvionUseCase {
    AvionFileLocalDataSource avionFileLocalDataSource;
    public void execute(Avion avion){
        avionFileLocalDataSource.save(avion);
    }
}
