package com.concessionaria.BackConcessionaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionaria.BackConcessionaria.models.Carro;
import com.concessionaria.BackConcessionaria.services.CarroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Carros")
public class CarroControl {
    @Autowired
    private CarroService carroService;

    @GetMapping
    @CrossOrigin("http://localhost:3000/")
    public List<Carro> buscarTodos(){
        return carroService.findAll();
    }

    @PostMapping("/SaveCarro")
    @CrossOrigin("http://localhost:3000/")
    public Carro salvarCarro(@RequestBody Carro carro){
        return carroService.saveOne(carro);
    }
    
}
