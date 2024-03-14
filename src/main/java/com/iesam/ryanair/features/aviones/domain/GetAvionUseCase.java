package com.iesam.ryanair.features.aviones.domain;

public class GetAvionUseCase {

    private AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public Avion execute(String avionId){
        return this.avionRepository.getAvion(avionId);
    }
}
