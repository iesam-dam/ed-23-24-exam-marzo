package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.vuelo.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelo.data.local.VueloMemLocalDataSource;

public class ObtenerVueloByIdUseCase {
   VueloFileLocalDataSource vueloFileLocalDataSource;

    public Vuelo execute(String id){
        return vueloFileLocalDataSource.findById(id);
    }
}
