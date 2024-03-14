package com.iesam.ryanair.features.vuelo.presentation;

import com.iesam.ryanair.features.vuelo.domain.CreateVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.ObtenerVueloByIdUseCase;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;

public class VueloPresentation {
    public static void create(Vuelo vuelo){
        CreateVueloUseCase createVueloUseCase = new CreateVueloUseCase();
        createVueloUseCase.execute(vuelo);
    }
    public static Vuelo  get(String id){
        ObtenerVueloByIdUseCase obtenerVueloByIdUseCase = new ObtenerVueloByIdUseCase();
        return obtenerVueloByIdUseCase.execute(id);
    }
}
