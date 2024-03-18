package com.iesam.ryanair.features.Vuelo.presentation;

import com.iesam.ryanair.features.Avion.domain.Avion;
import com.iesam.ryanair.features.Vuelo.data.VueloDataRepository;
import com.iesam.ryanair.features.Vuelo.domain.GetVueloUseCase;
import com.iesam.ryanair.features.Vuelo.domain.Vuelo;

public class MainVuelo {
    public Avion obtainVuelo(String codigoVuelo) {
        GetVueloUseCase getVueloUseCase = new GetVueloUseCase(new VueloDataRepository());
        Vuelo vuelo = getVueloUseCase.obtain(codigoVuelo);
        System.out.println(vuelo.toString());
    }
    return Vuelo;
}
