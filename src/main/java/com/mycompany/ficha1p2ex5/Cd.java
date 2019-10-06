/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha1p2ex5;

/**
 *
 * @author vitor
 */
public class Cd extends Media{
    private int faixas; 

    public Cd(int faixas, String autor) {
        super(autor);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "\nCd:" +"Autor: "+ getAutor() +" faixas:" + faixas ;
    }
    
   

    
    
}
