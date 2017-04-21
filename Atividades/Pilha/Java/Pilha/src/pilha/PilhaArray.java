/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.ArrayList;

/**
 *
 * @author yurih
 */
public class PilhaArray implements IPilha {
    // Armazena elementos da pilha

    private Object Elementos[];
    // Indice do elemento no topo
    private int index = -1;
    // Metodo de aumento do array
    private int metodo;
    //Constante para aumento do tamanho
    private int constante = 5;

    public PilhaArray(int tamanho) {
        Elementos = new Object[tamanho];
        this.metodo = 0;
    }

    public PilhaArray(int tamanho, int metodo) {
        Elementos = new Object[tamanho];
        this.metodo = metodo;
    }

    public PilhaArray(int tamanho, int metodo, int tamanho_const) {
        Elementos = new Object[tamanho];
        this.metodo = metodo;
        this.constante = tamanho_const;
    }

    @Override
    public int size() {
        return (index + 1);
    }

    @Override
    public boolean isEmpty() {
        return (index == -1);
    }

    @Override
    public Object top() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está vazia!");
        }

        return Elementos[index];
    }

    /*
	* Recebe o valor a ser inserido e uma opcao de 
	* aumento da pilha
	* se a opcao == 0 entao aum}enta constantemente
	* se a opcao != 1 entao aumenta o dobro
     */
    @Override
    public void push(Object obj) {
        if (index == Elementos.length - 1) {
            Object ElementosAux[] = Elementos;

            if (metodo == 0) {
                //System.out.println("Pilha cheia!\nDobrando o tamanho...");
                Elementos = new Object[(index + 1) * 2];
            } else {
                //System.out.println("Pilha cheia!\nAumentando o tamanho em " + constante + "...");
                Elementos = new Object[index + constante + 1];
            }

            for (int i = 0; i <= index; i++) {
                Elementos[i] = ElementosAux[i];
            }
        }

        Elementos[++index] = obj;
    }

    public void adicionaPilha(PilhaArray p) throws EPilhaVazia {
        PilhaArray p_aux = p;
        ArrayList<Object> array_aux = new ArrayList<>();
       
        for (int i = p_aux.size()-1; i >= 0; i--) {
            array_aux.add(p_aux.top());
            p_aux.pop();
        }
        
        for (int i = array_aux.size()-1; i >= 0; i--) {
            this.push(array_aux.get(i));
        }        
    }

    @Override
    public Object pop() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está vazia!");
        }

        Object temp = Elementos[index];
        Elementos[index] = null;
        index -= 1;
        return temp;
    }

    public void empty() {
        Elementos = null;
        index = -1;
    }

    public void show() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha está vazia!");
        } else {
            for (int i = 0; i <= index; i++) {
                System.out.println(Elementos[i]);
            }
        }
    }
}
