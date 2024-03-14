package com.iesam.ryanair.features.vuelo.data.local;

import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VueloMemLocalDataSource {
    private Map<String, Vuelo> dataStore = new TreeMap<>();

    public void save(Vuelo model) {
        dataStore.put(model.getId(), model);
    }

    public void saveList(List<Vuelo> models) {
        for (Vuelo vuelo : models) {
            save(vuelo);
        }
    }

    public Vuelo findById(String id) {
        return dataStore.get(id);
    }

    public List<Vuelo> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }

}
