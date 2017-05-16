import java.util.Iterator;
import java.util.Vector;
public class ArvoreSimples implements ArvoreGenerica
{
	
	No raiz;
	int tamanho;
	
	public ArvoreSimples(Object o)
	{
		raiz = new No(null, o);
		tamanho = 1;
	}
	
	public No root()
	{
		return raiz;
	}
	
	public No parent(No v)
	{
		return (v.parent());
	}

	
	public Iterator children(No v)
	{
		return v.children();
	}
	
	public boolean isInternal(No v)
	{
		return (v.childrenNumber() > 0);
	}
	
	public boolean isExternal(No v)
	{
		return (v.childrenNumber() == 0);
	}
	
	public boolean isRoot(No v)
	{
		return v == raiz;
	}
	
	public void addChild(No v, Object o)
	{
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	
	public Object remove(No v) throws InvalidNoException
	{
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new InvalidNoException();
		Object o = v.element();
		tamanho--;
		return o;
	}
	
	public void swapElements(No v, No w)
	{
		
		
	}
	
	public int depth(No v)
	{
		int profundidade = profundidade(v);
		return profundidade;
	}
	private int profundidade(No v)
	{
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}
	
	public int height()
	{
		
		int altura = 0;
		return altura;
	}
	
	public Iterator elements()
	{
		
		return null;
	}
	
	public Iterator Nos()
	{
		
		return null;
	}
	
	public int size()
	{
		return 0;
	}
	
	public boolean isEmpty()
	{
		return false;
	}
	public Object replace(No v, Object o)
	{
		
		return null;
	}
	
	private class No implements No
	{
		private Object o;
		private No pai;
		private Vector filhos = new Vector();
		public No(No pai, Object o)
		{
			this.pai = pai;
			this.o = o;
		}
		public Object element()
		{
			return o;
		}
		public No parent()
		{
			return pai;
		}
		public void setElement(Object o)
		{
			this.o = o;
		}
		public void addChild(No o)
		{
			filhos.add(o);
		}
		public void removeChild(No o)
		{
			filhos.remove(o);
		}
		public int childrenNumber()
		{
			return filhos.size();
		}
		public Iterator children()
		{
			return filhos.iterator();
		}
	}
	
}
