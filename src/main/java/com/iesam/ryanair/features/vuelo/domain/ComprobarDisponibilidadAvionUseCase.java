package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.vuelo.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelo.data.local.VueloMemLocalDataSource;

import java.util.ArrayList;
import java.util.List;

public class ComprobarDisponibilidadAvionUseCase {
    VueloFileLocalDataSource vueloFileLocalDataSource;
    public boolean execute(String id){
        if(vueloFileLocalDataSource.findById(id).getId().equals(id)){
            return true;
        };
        return false;
    }
}
