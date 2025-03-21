/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.samuel.GarageAPI.DTO;

import br.dev.samuel.GarageAPI.entities.Veiculo;

/**
 *
 * @author sesidevb
 */
public class VeiculoDTO {
    private long id;
    private String nomeVeiculo;
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private double km;
    private String linkImagem;

    public VeiculoDTO() {
    }
    
    public VeiculoDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
    }
}
