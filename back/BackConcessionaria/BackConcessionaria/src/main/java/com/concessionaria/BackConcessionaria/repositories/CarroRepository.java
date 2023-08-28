package com.concessionaria.BackConcessionaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionaria.BackConcessionaria.models.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
    
}
