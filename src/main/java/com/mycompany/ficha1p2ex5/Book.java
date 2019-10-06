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
public class Book extends Media{
    
    private int paginas;

    public Book(int paginas, String autor) {
        super(autor);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    

    @Override
    public String toString() {
        return "\nBook:  Autor: " + getAutor()+" Paginas: "+paginas;
    }
    
}
