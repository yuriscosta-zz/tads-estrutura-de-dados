/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore_binaria;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author yuri
 */
public class Arvore implements IArvore {

    private No raiz;
    private int tamanho;

    private Arvore() {
        this.raiz = null;
        this.tamanho = 0;
    }

    private Arvore(No raiz) {
        this.raiz = raiz;
        this.tamanho = 0;
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public boolean estaVazia() {
        return (raiz() == null);
    }

    @Override
    public int altura() {
        return altura(raiz());
    }

    private int altura(No no) {
        if (raiz() == null) {
            return -1;
        }

        int alturaEsq = altura(raiz().getFilho_esq());
        int alturaDir = altura(raiz().getFilho_dir());
        if (alturaEsq > alturaDir) {
            return 1 + alturaEsq;
        } else {
            return 1 + alturaDir;
        }

    }

    @Override
    public int profundidade(No no) {
        if (eRaiz(no)) {
            return 0;
        }
        
        return 1 + profundidade(no.getPai());
    }

    @Override
    public Iterator valores() {
        Vector valores = new Vector();
        for (Iterator<No> no = nos(); no.hasNext();) {
            valores.add(no.next().getValor());
        }
        
        return valores.iterator();
    }

    @Override
    public Iterator nos() {
        return nos(raiz()).iterator();
    }
    
    private Vector nos(No no) {
        Vector valores = new Vector();
        valores.add(no);
        if (temFilhoEsquerdo(no)) {
            valores.addAll(nos(filhoEsquerdo(no)));
        }
        if (temFilhoDireito(no)) {
            valores.addAll(nos(filhoDireito(no)));
        }
        
        return valores;
    }
    
    @Override
    public No raiz() {
        return this.raiz;
    }

    @Override
    public No pai(No no) {
        if (!eRaiz(no)) {
            return no.getPai();
        }

        return null;
    }

    @Override
    public No filhoDireito(No no) {
        if (eExterno(no)) {
            return null;
        }

        return no.getFilho_esq();
    }

    @Override
    public No filhoEsquerdo(No no) {
        if (eExterno(no)) {
            return null;
        }

        return no.getFilho_esq();
    }

    @Override
    public No irmao(No no) {
        No pai = no.getPai();
        if (no == pai.getFilho_dir()) {
            return pai.getFilho_esq();
        } else if (no == pai.getFilho_esq()) {
            return pai.getFilho_dir();
        }

        return null;
    }

    @Override
    public boolean eExterno(No no) {
        return (!temFilhoDireito(no) && !temFilhoEsquerdo(no));
    }

    @Override
    public boolean eInterno(No no) {
        return (temFilhoDireito(no) || temFilhoEsquerdo(no));
    }

    @Override
    public boolean eRaiz(No no) {
        return (no == raiz());
    }

    @Override
    public boolean temFilhoDireito(No no) {
        return (no.getFilho_dir() != null);
    }

    @Override
    public boolean temFilhoEsquerdo(No no) {
        return (no.getFilho_esq() != null);
    }

    @Override
    public boolean temIrmao(No no) {
        return (irmao(no) != null);
    }

    @Override
    public void inserir(Object chave, Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remover(Object chave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
