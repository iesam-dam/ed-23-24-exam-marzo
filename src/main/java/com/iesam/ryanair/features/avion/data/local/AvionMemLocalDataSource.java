package com.iesam.ryanair.features.avion.data.local;

import com.iesam.ryanair.features.avion.domain.Avion;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AvionMemLocalDataSource {
    private Map<String, Avion> dataStore = new TreeMap<>();

    public void save(Avion model) {
        dataStore.put(model.getId(), model);
    }

    public void saveList(List<Avion> models) {
        for (Avion avion : models) {
            save(avion);
        }
    }

    public Avion findById(String id) {
        return dataStore.get(id);
    }

    public List<Avion> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
