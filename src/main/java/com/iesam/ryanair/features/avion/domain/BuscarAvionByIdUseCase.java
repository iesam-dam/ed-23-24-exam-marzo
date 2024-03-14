package com.iesam.ryanair.features.avion.domain;

import com.iesam.ryanair.features.avion.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.avion.data.local.AvionMemLocalDataSource;

public class BuscarAvionByIdUseCase {
    AvionFileLocalDataSource avionFileLocalDataSource;
    public Avion execute(String id){
     return    avionFileLocalDataSource.findById(id);
    }
}
