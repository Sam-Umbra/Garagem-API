/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.samuel.GarageAPI.controllers;

import br.dev.samuel.GarageAPI.entities.Veiculo;
import br.dev.samuel.GarageAPI.service.GaragemService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    
    @GetMapping("forsale/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable long id) {
        Optional<Veiculo> optionalVeiculo = garagemService.findById(id);
        
        if (optionalVeiculo.isPresent()) {
            Veiculo veiculo = optionalVeiculo.get();
            
            return ResponseEntity.ok(veiculo);
            
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
