package com.iesam.ryanair.features.empleados.data;

import com.iesam.ryanair.features.empleados.data.local.DemoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {

    DemoMemLocalDataSource demoMemLocalDataSource;

    public EmpleadoDataRepository(DemoMemLocalDataSource demoMemLocalDataSource) {
        this.demoMemLocalDataSource = demoMemLocalDataSource;
    }


    @Override
    public void saveEmpleado(Empleado empleado) {
        demoMemLocalDataSource.save(empleado);
    }
}
