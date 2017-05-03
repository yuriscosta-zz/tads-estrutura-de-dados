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
    private int metodo;
    private int constante = 10;

    /**
     *
     * @param tamanho
     */
    public Fila(int tamanho) {
        fila = new Object[tamanho];
        this.tamanho = tamanho;
        this.metodo = 0;
    }

    public Fila(int tamanho, int metodo) {
        fila = new Object[tamanho];
        this.tamanho = tamanho;
        this.metodo = metodo;
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
     */
    @Override
    public void enfileirar(Object obj) {
        if (tamanho() == tamanho - 1) {

            Object aux[];
            if (metodo == 0) {
                aux = new Object[tamanho + constante];
            } else {
                aux = new Object[tamanho * 2];
            }

            int tam_aux = aux.length;
            int fim_aux = 0;
            int i;

            for (i = 0; i < tamanho - 1; i++, inicio++) {
                aux[i] = fila[inicio % tamanho];
                fim_aux++;
            }
 
            fila = aux;
            inicio = 0;
            fim = i;
            tamanho = tam_aux;
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
