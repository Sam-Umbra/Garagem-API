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
        this.nomeVeiculo = veiculo.getNomeVeiculo();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
        this.linkImagem = veiculo.getLinkImagem();
    }

    public long getId() {
        return id;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
    
}
