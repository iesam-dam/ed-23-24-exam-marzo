package com.iesam.ryanair.features.empleados.presentation;

import com.iesam.ryanair.features.empleados.data.EmpleadoDataRepository;
import com.iesam.ryanair.features.empleados.data.local.DemoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.SaveEmpleadoUseCase;

public class EmpleadoPresentation {

    public static void save(Empleado empleado){
        SaveEmpleadoUseCase saveEmpleadoUseCase= new SaveEmpleadoUseCase(
                new EmpleadoDataRepository(new DemoMemLocalDataSource()));
        saveEmpleadoUseCase.execute(empleado);
    }
}
