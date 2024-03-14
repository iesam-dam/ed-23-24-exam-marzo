package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.vuelo.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelo.data.local.VueloMemLocalDataSource;

public class CreateVueloUseCase {
    VueloFileLocalDataSource vueloFileLocalDataSource;
    public void execute(Vuelo vuelo){
        ComprobarDisponibilidadAvionUseCase comprobarDisponibilidadAvionUseCase = new ComprobarDisponibilidadAvionUseCase();
        if(comprobarDisponibilidadAvionUseCase.execute(vuelo.Id)) {
            vueloFileLocalDataSource.save(vuelo);
        }else System.out.println("El avion ya esta asignado a otro vuelo");
    }
}
