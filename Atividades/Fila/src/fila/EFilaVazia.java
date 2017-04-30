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
public class EFilaVazia extends Exception {

    public EFilaVazia() {
    }

    public EFilaVazia(String mensagem) {
        super(mensagem);
    }
}
