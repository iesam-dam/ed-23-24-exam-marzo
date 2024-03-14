package com.iesam.ryanair.features.aviones.presentation;

import com.iesam.ryanair.features.aviones.data.AvionDataRepository;
import com.iesam.ryanair.features.aviones.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.GetAvionUseCase;
import com.iesam.ryanair.features.aviones.domain.SaveAvionUseCase;

public class AvionPresentation {

    public static void save(Avion avion){
        SaveAvionUseCase saveAvionUseCase= new SaveAvionUseCase(
                new AvionDataRepository(new AvionFileLocalDataSource()));
        saveAvionUseCase.execute(avion);
    }

    public static void get(String avionId){
        GetAvionUseCase getAvionUseCase= new GetAvionUseCase(
                new AvionDataRepository(new AvionFileLocalDataSource()));
        getAvionUseCase.execute(avionId);
    }
}
