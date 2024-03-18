package com.iesam.ryanair;

import com.iesam.ryanair.features.Avion.domain.Avion;
import com.iesam.ryanair.features.Avion.presentation.MainAvion;
import com.iesam.ryanair.features.Pasajeros.domain.Pasajeros;
import com.iesam.ryanair.features.Pasajeros.presentation.MainPasajeros;
import com.iesam.ryanair.features.Tripulantes.domain.Tripulantes;
import com.iesam.ryanair.features.Tripulantes.presentation.MainTripulantes;
import com.iesam.ryanair.features.Vuelo.domain.Vuelo;
import com.iesam.ryanair.features.Vuelo.presentation.MainVuelo;

public class Main {
    public static void main(String[] args) {
        //1
        Tripulantes empleado1 = new Tripulantes("700001", "empleado1", "empleadoApellido1", "piloto");
        Tripulantes empleado2 = new Tripulantes("700002", "empleado2", "empleadoApellido2", "piloto");
        Tripulantes empleado3 = new Tripulantes("700003", "empleado3", "empleadoApellido3", "azafata");
        MainTripulantes mainTripulantes = new MainTripulantes();
        mainTripulantes.saveTripulantes(empleado1);
        mainTripulantes.saveTripulantes(empleado2);
        mainTripulantes.saveTripulantes(empleado3);
        //2
        Pasajeros pasajero1 = new Pasajeros("800001", "Pasajero1", "ApellidoPasajero1", "Avila", "Avila");
        Pasajeros pasajero2 = new Pasajeros("800002", "Pasajero2", "ApellidoPasajero2", "Avila", "Avila");
        MainPasajeros mainPasajeros = new MainPasajeros();
        mainPasajeros.savePasajeros(pasajero1);
        mainPasajeros.savePasajeros(pasajero2);
        //3
        Avion avion = new Avion("100001", "Pajarito", "Boing701", "200");
        Avion avion1 = new Avion("100002", "Nube", "Boing705", "250");
        Avion avion2 = new Avion("100003", "Rayo", "Boing710", "100");
        MainAvion mainAvion = new MainAvion();
        mainAvion.saveAvion(avion1);
        mainAvion.saveAvion(avion2);
        //4
        MainVuelo mainVuelo = new MainVuelo();
        Avion avionVuelo = mainVuelo.obtainVuelo("100001");
        Pasajeros pasajeros = new Pasajeros("7000001", "jdiejd", "hehfue", "TG4TG45T", "aVILA");
        pasajeros.getDni(mainPasajeros.savePasajeros("800001"));
        pasajeros.getDni(mainPasajeros.savePasajeros("800002"));
        Tripulantes tripulantes = new Tripulantes("70001");
        tripulantes.getCargo(mainTripulantes.obtainTripulantes("700001"));
        tripulantes.getCargo(mainTripulantes.obtainTripulantes("700002"));
        Vuelo vuelo1 = new Vuelo("1", avionVuelo, tripulantes, pasajeros, "10/02/2024", "10:30H", "90e", "Madrid", "Barcelona");
        mainVuelo.obtainVuelo(String.valueOf(vuelo1));

        mainVuelo.obtainVuelo("1");
    }


    }
