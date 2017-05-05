/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacomlistaencadeada;

/**
 *
 * @author yurih
 */
public class Fila {

    private No inicio;
    private No fim;
    private int qtdElementos;

    private class No {

        private Object elemento;
        private No proximo;

        public Object getElemento() {
            return elemento;
        }

        public void setElemento(Object elemento) {
            this.elemento = elemento;
        }
    }

    public Fila() {
        inicio = fim = null;
        qtdElementos = 0;
    }

    public int tamanho() {
        return qtdElementos;
    }

    public boolean estaVazia() {
        return (inicio == null);
    }

    public void inserir(Object obj) {
        No fimAnterior = fim;
        fim = new No();
        fim.setElemento(obj);
        fim.proximo = null;
        if (estaVazia()) {
            inicio = fim;
        } else {
            fimAnterior.proximo = fim; 
        }
        
        qtdElementos++;
    }

    public Object remover() throws EFilaVazia {
        if (estaVazia()) {
            throw new EFilaVazia("A fila está vazia!");
        }
        
        Object aux = inicio.getElemento();
        inicio = inicio.proximo;
        qtdElementos--;
        
        return aux;
    }

    public void exibir() throws EFilaVazia {
       if (estaVazia()) {
           throw new EFilaVazia("A fila está vazia!");
       }
       
       No atual = inicio;
       while(atual != null) {
           System.out.println(atual.getElemento());
           atual = atual.proximo;
       }
    }
}
