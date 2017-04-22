/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilharubronegra;

/**
 *
 * @author yurih
 */
public interface IPilha{
	public int totalSize();
        
        public int vermelhaSize();
	
        public int pretaSize();
        
	public boolean isEmpty();
	
	public Object topPreta()
		throws EPilhaVazia;
        
        public Object topVermelha()
		throws EPilhaVazia;
        
	public void pushPreta(Object obj)
                throws EPilhaCheia;
        
        public void pushVermelha(Object obj)
                throws EPilhaCheia;
	
	public Object popPreta()
		throws EPilhaVazia;
        
        public Object popVermelha()
		throws EPilhaVazia;
}