package com.iesam.ryanair.features.vuelos.presentation;

import com.iesam.ryanair.features.vuelos.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelos.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelos.domain.GetVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.SaveVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;

public class VueloPresentation {

    public static void save(Vuelo vuelo){
        SaveVueloUseCase saveVueloUseCase= new SaveVueloUseCase(
                new VueloDataRepository(new VueloFileLocalDataSource()));
        saveVueloUseCase.execute(vuelo);
    }

    public static Vuelo get(String vueloId){
        GetVueloUseCase getVueloUseCase= new GetVueloUseCase(
                new VueloDataRepository(new VueloFileLocalDataSource()));
        return getVueloUseCase.execute(vueloId);
    }
}
