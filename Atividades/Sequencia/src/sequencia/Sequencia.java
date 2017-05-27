/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yurih
 */
public class Sequencia implements ISequencia {

    private No first;
    private No last;
    private int qtdElements;

    @Override
    public int size() {
        return qtdElements;
    }

    @Override
    public boolean isEmpty() {
        return (qtdElements == 0);
    }

    @Override
    public No first() throws ESequenciaVazia {
        if (isEmpty()) {
            throw new ESequenciaVazia("A Sequência está vazia!");
        }

        return first;
    }

    @Override
    public No last() throws ESequenciaVazia {
        if (isEmpty()) {
            throw new ESequenciaVazia("A Sequência está vazia!");
        }

        return last;
    }

    @Override
    public No before(No no) throws ESequenciaVazia {
        if (isEmpty()) {
            throw new ESequenciaVazia("A Sequência está vazia!");
        }

        return no.getBefore();
    }

    @Override
    public No after(No no) throws ESequenciaVazia {
        if (isEmpty()) {
            throw new ESequenciaVazia("A Sequência está vazia!");
        }

        return no.getAfter();
    }

    @Override
    public void replaceElement(No no, Object object) {
        no.setElement(object);
    }

    @Override
    public void swapElements(No first_no, No second_no) {
        Object aux = first_no.getElement();
        first_no.setElement(second_no.getElement());
        second_no.setElement(aux);
    }

    @Override
    public void insertBefore(No current_no, No new_no) {
        if (current_no == first) {
            first.setBefore(new_no);
            new_no.setAfter(current_no);
            first = new_no;
        } else {
            new_no.setAfter(current_no);
            new_no.setBefore(current_no.getBefore());
            current_no.getBefore().setAfter(new_no);
            current_no.setBefore(new_no);
        }

        qtdElements++;
    }

    @Override
    public void insertAfter(No current_no, No new_no) {
        if (current_no == last) {
            current_no.setAfter(new_no);
            new_no.setBefore(current_no);
            last = new_no;
        } else {
            new_no.setAfter(current_no.getAfter());
            new_no.setBefore(current_no);
            current_no.getAfter().setBefore(new_no);
            current_no.setAfter(new_no);
        }

        qtdElements++;
    }

    @Override
    public void insertFirst(No no) {
        first = no;
        qtdElements++;
    }

    @Override
    public void insertLast(No no) {
        last = no;
        qtdElements++;
    }

    @Override
    public No remove(No no) {
        No aux;
        if (no == first) {
            aux = first;
            first = first.getAfter();
            first.setBefore(null);
            aux.setAfter(null);
        } else if (no == last) {
            aux = last;
            last = last.getBefore();
            last.setAfter(null);
            aux.setBefore(null);
        } else {
            aux = no;
            no.getBefore().setAfter(no.getAfter());
            no.getAfter().setBefore(no.getBefore());
            no.setAfter(null);
            no.setBefore(null);
            aux.setAfter(null);
            aux.setBefore(null);
        }

        qtdElements--;
        return aux;
    }

    @Override
    public No atRank(int rank) {
        //TODO
    }

    public int rankOf(No no) {
        No aux_no = first;
        int rank = 0;
        while (aux_no != no && aux_no != null) {
            aux_no = aux_no.getAfter();
            rank++;
        }

        return rank;
    }
    
    public void replaceAtRank(int rank, Object object) {
        
    }
}
