/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author romario.2919
 */
public class Computador extends Produto {
    private Double memoriaRam;
    private String Processador;

    public Computador() {
    }

    public Double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;
    }

    @Override
    public String toString() {
        return  "Nome:  " + super.getNome() +
                " | Preço: " + super.getPreco() +
                " | Memoria Ram: " + this.memoriaRam + 
                " | Processador: " + this.Processador;
    }
    
    
    
}
