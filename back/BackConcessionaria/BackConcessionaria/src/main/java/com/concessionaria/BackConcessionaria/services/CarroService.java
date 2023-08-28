package com.concessionaria.BackConcessionaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionaria.BackConcessionaria.models.Carro;
import com.concessionaria.BackConcessionaria.repositories.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> findAll(){
        return carroRepository.findAll();
    }

    public Carro saveOne(Carro carro){
        return carroRepository.save(carro);
    }
    
}
