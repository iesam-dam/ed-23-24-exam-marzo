package com.iesam.ryanair.features.empleados.domain;



public class SaveEmpleadoUseCase {

    private EmpleadoRepository empleadoRepository;

    public SaveEmpleadoUseCase(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void execute(Empleado empleado){
        this.empleadoRepository.saveEmpleado(empleado);
    }
}
