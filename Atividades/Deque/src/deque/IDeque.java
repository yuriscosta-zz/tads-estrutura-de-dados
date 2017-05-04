/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author yurih
 */
public interface IDeque {

    /**
     *
     * @return
     */
    public int tamanho();

    /**
     *
     * @return
     */
    public boolean estaVazio();

    /**
     *
     * @return @throws deque.EDequeVazio
     */
    public Object primeiro()
            throws EDequeVazio;

    /**
     *
     * @return @throws deque.EDequeVazio
     */
    public Object ultimo()
            throws EDequeVazio;

    /**
     *
     * @param obj
     */
    public void inserirInicio(Object obj);

    /**
     *
     * @param obj
     */
    public void inserirFim(Object obj);

    /**
     *
     * @return @throws deque.EDequeVazio
     */
    public Object removerInicio()
            throws EDequeVazio;

    /**
     *
     * @return @throws deque.EDequeVazio
     */
    public Object removerFim()
            throws EDequeVazio;
}
