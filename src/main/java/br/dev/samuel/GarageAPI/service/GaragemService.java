/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.samuel.GarageAPI.service;

import br.dev.samuel.GarageAPI.entities.Veiculo;
import br.dev.samuel.GarageAPI.repositories.GaragemRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesidevb
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
    
    public Optional<Veiculo> findById(long id) {
        return garagemRepository.findById(id);
    }
}
