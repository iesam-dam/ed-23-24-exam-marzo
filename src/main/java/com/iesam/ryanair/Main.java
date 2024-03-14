package com.iesam.ryanair;

import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.avion.presentation.AvionPresentation;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.presentation.PasajeroPresentation;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;
import com.iesam.ryanair.features.tripulante.presentation.TripulantePresentation;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.presentation.VueloPresentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Tripulante tripulante1 = new Tripulante("700001","Empleado1","EmpleadoApellido1","Piloto");
        Tripulante tripulante2 = new Tripulante("700002","Empleado2","EmpleadoApellido2","Piloto");
        Tripulante tripulante3 = new Tripulante("700003","Empleado3","EmpleadoApellido3","Azafata");
        Pasajero pasajero1 = new Pasajero("800001","Pasajero1","PasajeroApellido1","Ávila","Ávila");
        Pasajero pasajero2 = new Pasajero("800002","Pasajero2","PasajeroApellido2","Ávila","Ávila");
        Avion avion1 = new Avion("100001","Pajarito","Boing701",200);
        Avion avion2 = new Avion("100002","Nube","Boing705",250);
        Avion avion3 = new Avion("100003","Rayo","Boing71o",100);

        TripulantePresentation.create(tripulante1);
        TripulantePresentation.create(tripulante2);
        TripulantePresentation.create(tripulante3);
        PasajeroPresentation.create(pasajero1);
        PasajeroPresentation.create(pasajero2);
        AvionPresentation.create(avion1);
        AvionPresentation.create(avion2);
        AvionPresentation.create(avion3);
        List<Tripulante> listatripulantes = null;
        List<Pasajero> listapasajeros= null ;
        listatripulantes.add (TripulantePresentation.get("700001"));
        listatripulantes.add(TripulantePresentation.get("700003"));
        listapasajeros.add(PasajeroPresentation.get("800001"));
        listapasajeros.add(PasajeroPresentation.get("800002"));
        Vuelo vuelo1 = new Vuelo(
                "1",
                AvionPresentation.get("100001"),
                listatripulantes,
                listapasajeros,
                "10/02/2024",
                "10:30",
                "90€",
                "Madrid",
                "Barcelona"
        );
        VueloPresentation.create(vuelo1);
        VueloPresentation.get("1");
    }

}