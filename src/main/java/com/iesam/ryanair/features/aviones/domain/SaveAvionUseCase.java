package com.iesam.ryanair.features.aviones.domain;

public class SaveAvionUseCase {

    private AvionRepository avionRepository;

    public SaveAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public void execute(Avion avion){
        this.avionRepository.saveAvion(avion);
    }
}
