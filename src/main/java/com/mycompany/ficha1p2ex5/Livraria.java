/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha1p2ex5;
import java.util.ArrayList;
/**
 *
 * @author vitor
 */
public class Livraria <T extends Media> {
    ArrayList<T> lista = new ArrayList<> ();

    public Livraria() {
    }
    
    public void adicionar(T item){
        lista.add(item);
        
    }
    
    public void removeItem(T item){
        lista.remove(item);
    }
    
    public void removeIndex(int index){
        lista.remove(index);
    }
    
    public T obterIndex(int index){
        return lista.get(index);
    }

    @Override
    public String toString() {
        return "Livraria{" + "lista=" + lista + '}';
    }
    
    
    
    
}
