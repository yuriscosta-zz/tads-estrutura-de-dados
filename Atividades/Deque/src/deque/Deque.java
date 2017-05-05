/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author yurih
 */
public class Deque implements IDeque {

    private Object deque[];
    private int inicio = 0;
    private int fim = inicio;
    private int tamanho;
    private int metodo;
    private int constante = 5;

    public Deque(int tamanho, int metodo) {
        deque = new Object[tamanho];
        this.tamanho = tamanho;
        this.metodo = metodo;
    }

    public Deque(int tamanho, int metodo, int constante) {
        deque = new Object[tamanho];
        this.tamanho = tamanho;
        this.metodo = metodo;
        this.constante = constante;
    }

    @Override
    public int tamanho() {
        return (tamanho - inicio + fim) % tamanho;
    }

    @Override
    public boolean estaVazio() {
        return (inicio == fim);
    }

    @Override
    public Object primeiro() throws EDequeVazio {
        if (estaVazio()) {
            throw new EDequeVazio("O Deque está vazio!");
        }

        return deque[inicio];
    }

    @Override
    public Object ultimo() throws EDequeVazio {
        if (estaVazio()) {
            throw new EDequeVazio("O Deque está vazio!");
        }

        return deque[fim];
    }

    @Override
    public void inserirInicio(Object obj) {
        if (tamanho() == tamanho - 1) {

            Object aux[];
            if (metodo == 0) {
                aux = new Object[tamanho + constante];
            } else {
                aux = new Object[tamanho * 2];
            }

            int tam_aux = aux.length;
            int i;

            for (i = 0; i < tamanho - 1; i++, inicio++) {
                aux[i] = deque[inicio % tamanho];
            }

            deque = aux;
            inicio = 0;
            tamanho = tam_aux;
        }

        Object aux[] = new Object[tamanho];
        aux[0] = obj;
        for (int i = 1; i < tamanho - 1; i++) {
            aux[i] = deque[i - 1];
        }

        deque = aux;
        fim = (fim + 1) % tamanho;
    }

    @Override
    public void inserirFim(Object obj) {
        if (tamanho() == tamanho - 1) {

            Object aux[];
            if (metodo == 0) {
                aux = new Object[tamanho + constante];
            } else {
                aux = new Object[tamanho * 2];
            }

            int tam_aux = aux.length;
            int i;

            for (i = 0; i < tamanho - 1; i++, inicio++) {
                aux[i] = deque[inicio % tamanho];
            }

            deque = aux;
            inicio = 0;
            fim = i;
            tamanho = tam_aux;
        }

        deque[fim] = obj;
        fim = (fim + 1) % tamanho;
    }

    @Override
    public Object removerInicio() throws EDequeVazio {
        if (estaVazio()) {
            throw new EDequeVazio("O Deque está vazio!");
        }

        Object aux = deque[inicio];
        deque[inicio] = null;
        inicio = (inicio + 1) % tamanho;
        return aux;
    }

    @Override
    public Object removerFim() throws EDequeVazio {
        if (estaVazio()) {
            throw new EDequeVazio("O Deque está vazio!");
        }

        Object aux = deque[fim - 1];
        deque[fim - 1] = null;
        fim = (fim - 1) % tamanho;
        return aux;
    }

    public void exibirDeque() {
        System.out.println("-------------------------------------------------");
        for (Object obj : deque) {
            System.out.print(obj + " ");
        }
        System.out.println("\n-----------------------------------------------");
    }

}
