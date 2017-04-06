public interface IPilha{
	public int size();
	
	public boolean isEmpty();
	
	public Object top()
		throws EPilhaVazia;

	public void push(Object obj);
	
	public Object pop()
		throws EPilhaVazia;
}