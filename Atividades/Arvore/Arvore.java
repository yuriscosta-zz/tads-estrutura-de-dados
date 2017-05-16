import java.util.Iterator;

public interface Arvore
{
	static class No {
	}

	public int size();

	public boolean isEmpty();

	public int height();

	public Iterator elements();
	
	public Iterator nos();

	public No root();
	
	public No parent(No v);
	
	public Iterator children(No v);

	
	public boolean isInternal(No v);
	
	public boolean isExternal(No v);
	
	public boolean isRoot(No v);
	
	public int depth(No v);

	public Object replace(No v, Object o);
	
}
