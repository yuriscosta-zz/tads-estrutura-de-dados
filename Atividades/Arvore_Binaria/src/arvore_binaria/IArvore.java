/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore_binaria;

import java.util.Iterator;

/**
 *
 * @author yuri
 */
public interface IArvore {
    
    public int tamanho();
    public boolean estaVazia();
    public int altura();
    public int profundidade(No no);
    public Iterator valores();
    public Iterator nos();
    
    public No raiz();
    public No pai(No no);
    public No filhoDireito(No no);
    public No filhoEsquerdo(No no);
    public No irmao(No no);
    
    public boolean eExterno(No no);
    public boolean eInterno(No no);
    public boolean eRaiz(No no);
    public boolean temFilhoDireito(No no);
    public boolean temFilhoEsquerdo(No no);
    public boolean temIrmao(No no);
    
    public void inserir(Object chave, Object valor);
    public Object remover(Object chave);
    
}
