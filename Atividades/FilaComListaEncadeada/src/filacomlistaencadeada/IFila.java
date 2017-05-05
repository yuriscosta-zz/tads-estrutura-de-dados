/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacomlistaencadeada;

/**
 *
 * @author guest-yhwsjf
 */
public interface IFila {

    public int tamanho();

    public boolean estaVazia();

    public void inserir();

    public Object remover()
            throws EFilaVazia;

}
