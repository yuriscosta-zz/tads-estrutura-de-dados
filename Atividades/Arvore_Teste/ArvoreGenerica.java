/**
 * Classe que extende de Arvore e acrescenta m�todos para adicionar 
 * n�s em uma �rvore e remover n�s da �rvore
 */
import java.io.*;

public interface ArvoreGenerica extends Arvore
{
	
	public void addChild(No v, Object o);
	
	/**
	 * @param v
	 * @return Objeto que estava na pos��o que foi removida
	 * @throws InvalidNoException
	 */
	public Object remove(No v) throws InvalidNoException;
}