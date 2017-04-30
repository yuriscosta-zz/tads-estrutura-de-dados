/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author yurih
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws fila.EFilaCheia
     * @throws fila.EFilaVazia
     */
    public static void main(String[] args) throws EFilaCheia, EFilaVazia {
        Fila fila = new Fila(10);

        System.out.println("Fila está vazia? " + fila.isEmpty());

        for (int i = 0; i < 9; i++) {
            System.out.println("Inserindo o " + (i + 1) + "º elemento");
            fila.enfileirar(i * 5);
        }

        System.out.println("Fila está vazia? " + fila.isEmpty());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Inicio da fila: " + fila.inicio());

        fila.exibirFila();
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Removendo o " + fila.inicio() + "");
            fila.desenfileirar();
            fila.exibirFila();
        }
        
        fila.enfileirar(99);
        fila.enfileirar(100);
        
        fila.exibirFila();
        
        System.out.println(fila.desenfileirar());
        
        fila.exibirFila();
    }
}
