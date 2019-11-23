/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.model;

/**
 *
 * @author 20181210031
 */
public class Peca {
    
    private Integer codigoPeca;
    private Float valor;
    private Integer estoque;
    private Modelo modelo; 
    private String descricaoPeca; 
    
    public Peca(){
    
    }

    public Integer getCodigoPeca() {
        return codigoPeca;
    }

    public void setCodigoPeca(Integer codigoPeca) {
        this.codigoPeca = codigoPeca;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }
    @Override
    public String toString(){
        return descricaoPeca;
    }
}
