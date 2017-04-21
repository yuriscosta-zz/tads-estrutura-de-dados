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
public interface IPilha{
	public int size();
	
	public boolean isEmpty();
	
	public Object top()
		throws EPilhaVazia;

	public void push(Object obj);
	
	public Object pop()
		throws EPilhaVazia;
}