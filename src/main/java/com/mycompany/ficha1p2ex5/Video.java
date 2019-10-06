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
public class Video extends Media{
    
    private int duracao;

    public Video(int duracao, String autor) {
        super(autor);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
   
    @Override
    public String toString() {
        return "\nVideo: Autor: " + getAutor()+"Duracao: "+duracao;
    }
    
}
