/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.dev.samuel.GarageAPI.repositories;

import br.dev.samuel.GarageAPI.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesidevb
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long>{
    List<Veiculo> findByCorIgnoreCase(String cor);
    List<Veiculo> findByAno(String ano);
    List<Veiculo> findByMarcaIgnoreCase(String marca);
}
