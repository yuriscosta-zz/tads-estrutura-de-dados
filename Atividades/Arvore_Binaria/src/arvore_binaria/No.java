/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore_binaria;

/**
 *
 * @author yuri
 */
public class No {
    
    private Object chave;
    private Object valor;
    private No pai;
    private No filho_esq;
    private No filho_dir;

    public No() {
        this.chave = null;
        this.valor = null;
        this.pai = null;
        this.filho_esq = null;
        this.filho_dir = null;
    }

    public No(Object chave, Object valor, No pai, No filho_esq, No filho_dir) {
        this.chave = chave;
        this.valor = valor;
        this.pai = pai;
        this.filho_esq = filho_esq;
        this.filho_dir = filho_dir;
    }

    public Object getChave() {
        return chave;
    }

    public void setChave(Object chave) {
        this.chave = chave;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getFilho_esq() {
        return filho_esq;
    }

    public void setFilho_esq(No filho_esq) {
        this.filho_esq = filho_esq;
    }

    public No getFilho_dir() {
        return filho_dir;
    }

    public void setFilho_dir(No filho_dir) {
        this.filho_dir = filho_dir;
    }
    
}
