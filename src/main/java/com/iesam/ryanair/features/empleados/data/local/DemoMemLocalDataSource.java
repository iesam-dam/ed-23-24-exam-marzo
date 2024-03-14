package com.iesam.ryanair.features.empleados.data.local;

import com.iesam.ryanair.features.empleados.domain.Empleado;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DemoMemLocalDataSource {

    private Map<String, Empleado> dataStore = new TreeMap<>();

    public void save(Empleado empleado) {
        dataStore.put(empleado.getDni(), empleado);
    }

    public void saveList(List<Empleado> models) {
        for (Empleado empleado : models) {
            save(empleado);
        }
    }

    public Empleado findById(String id) {
        return dataStore.get(id);
    }

    public List<Empleado> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
