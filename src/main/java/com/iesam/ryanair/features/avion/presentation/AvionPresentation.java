package com.iesam.ryanair.features.avion.presentation;

import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.avion.domain.BuscarAvionByIdUseCase;
import com.iesam.ryanair.features.avion.domain.CreateAvionUseCase;

public class AvionPresentation {
    public static void create(Avion avion){
        CreateAvionUseCase createAvionUseCase = new CreateAvionUseCase();
        createAvionUseCase.execute(avion);
    }
    public static Avion get(String id){
        BuscarAvionByIdUseCase buscarAvionByIdUseCase = new BuscarAvionByIdUseCase();
       return   buscarAvionByIdUseCase.execute(id);
    }
}
