/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author yurih
 */
public class EPilhaVazia extends Exception {

    public EPilhaVazia() {
    }

    public EPilhaVazia(String mensagem) {
        super(mensagem);
    }
}
