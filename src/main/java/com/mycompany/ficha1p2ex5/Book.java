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
    
    public Book(String autor) {
        super(autor);
    }

    @Override
    public String toString() {
        return "Book:   " + getAutor();
    }
    
}