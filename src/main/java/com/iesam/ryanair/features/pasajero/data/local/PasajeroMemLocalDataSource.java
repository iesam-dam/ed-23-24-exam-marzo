package com.iesam.ryanair.features.pasajero.data.local;

import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PasajeroMemLocalDataSource {
    private Map<String, Pasajero> dataStore = new TreeMap<>();

    public void save(Pasajero model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Pasajero> models) {
        for (Pasajero tripulante : models) {
            save(tripulante);
        }
    }

    public Pasajero findById(String id) {
        return dataStore.get(id);
    }

    public List<Pasajero> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
