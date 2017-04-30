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
public class Fila implements IFila {

    private Object fila[];
    private int inicio = 0;
    private int fim = inicio;
    private int tamanho;

    /**
     *
     * @param tamanho
     */
    public Fila(int tamanho) {
        fila = new Object[tamanho];
        this.tamanho = tamanho;
    }

    /**
     *
     * @return
     */
    @Override
    public int tamanho() {
        return (tamanho - inicio + fim) % tamanho;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return (inicio == fim);
    }

    /**
     *
     * @throws fila.EFilaVazia
     */
    @Override
    public Object inicio() throws EFilaVazia {
        if (isEmpty()) {
            throw new EFilaVazia("A fila está vazia!");
        }

        return fila[inicio];
    }

    /**
     *
     * @param obj
     * @throws fila.EFilaCheia @throws EFilaVazia
     */
    @Override
    public void enfileirar(Object obj) throws EFilaCheia {
        if (tamanho() == tamanho - 1) {
            throw new EFilaCheia("A fila está cheia!");
        }

        fila[fim] = obj;
        fim = (fim + 1) % tamanho;
    }

    /**
     *
     * @return @throws EFilaVazia
     */
    @Override
    public Object desenfileirar() throws EFilaVazia {
        if (isEmpty()) {
            throw new EFilaVazia("A fila está vazia!");
        }

        Object aux = fila[inicio];
        fila[inicio] = null;
        inicio = (inicio + 1) % tamanho;
        return aux;
    }
    
    
    public void exibirFila() {
        System.out.println("---------------------");
        for (Object obj : fila) {
            System.out.print(obj + " ");
        }
        System.out.println("\n---------------------");
    }

}
