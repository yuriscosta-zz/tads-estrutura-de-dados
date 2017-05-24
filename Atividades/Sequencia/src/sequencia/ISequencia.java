/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencia;

/**
 *
 * @author yurih
 */

public interface ISequencia {

    public int size();

    public boolean isEmpty();

    public No first() throws ESequenciaVazia;

    public No last() throws ESequenciaVazia;
    
    public No before(No no) throws ESequenciaVazia;
    
    public No after(No no) throws ESequenciaVazia;
    
    public void replaceElement(No no, Object object);
    
    public void swapElements(No first_no, No second_no);
    
    public void insertBefore(No current_no, No new_no);
    
    public void insertAfter(No current_no, No new_no);
    
    public void insertFirst(No no);
    
    public void insertLast(No no);
    
    public No remove(No no);
    
    public No atRank(int rank);
    
}
