package com.iesam.ryanair.features.demo.data.local;

import com.iesam.ryanair.features.demo.domain.Demo;

import java.util.*;

public class DemoMemLocalDataSource {

    private Map<String, Demo> dataStore = new TreeMap<>();

    public void save(Demo model) {
        dataStore.put(model.getId(), model);
    }

    public void saveList(List<Demo> models) {
        for (Demo demo : models) {
            save(demo);
        }
    }

    public Demo findById(String id) {
        return dataStore.get(id);
    }

    public List<Demo> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
