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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cd cd1 = new Cd(12, "Latino House");
        Book book1 = new Book(456, "Algoritmia e Estruturas de Dados");
        Video video1 = new Video(12000, "Rocketman ");

        //Criaçao da livraria
        Livraria<Media> teste = new Livraria<>();
        //Teste de adicionar
        teste.adicionar(cd1);
        teste.adicionar(book1);
        teste.adicionar(video1);
        // teste de printar
        System.out.println("Teste de adicinar:\n" + teste.toString());

        //teste de remover
        teste.removeItem(video1);
        teste.removeIndex(0);
        System.out.println("\n\nTeste de remover:\n" + teste.toString());
        
        
        //teste de get
        System.out.println("\n\nTeste de obter: "+teste.obterIndex(0));

    }

}
