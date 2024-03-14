package com.iesam.ryanair.features.tripulante.data.local;

import com.iesam.ryanair.features.demo.domain.Demo;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TripulanteMemLocalDataSource {
    private Map<String, Tripulante> dataStore = new TreeMap<>();

    public void save(Tripulante model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Tripulante> models) {
        for (Tripulante tripulante : models) {
            save(tripulante);
        }
    }

    public Tripulante findById(String id) {
        return dataStore.get(id);
    }

    public List<Tripulante> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
