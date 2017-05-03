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
public interface IFila {

    /**
     *
     * @return
     */
    public int tamanho();

    /**
     *
     * @return
     */
    public boolean isEmpty();

    /**
     *
     * @return @throws EFilaVazia
     */
    public Object inicio()
            throws EFilaVazia;

    /**
     *
     * @param obj
     */
    public void enfileirar(Object obj);

    /**
     *
     * @return @throws EFilaVazia
     */
    public Object desenfileirar()
            throws EFilaVazia;

}
