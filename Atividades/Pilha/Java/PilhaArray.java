public class PilhaArray implements IPilha{
	// Armazena elementos da pilha
	private Object Elementos[];
	// Indice do elemento no topo
	private int index = -1;
	// Metodo de aumento do array
	private int metodo;
	//Constante para aumento do tamanhp
	static final int CONST = 5;

	public PilhaArray(int tamanho, int metodo) {
		Elementos = new Object[tamanho];
		this.metodo = metodo;
	}

	public int size() {
		return (index+1);
	}

	public boolean isEmpty() {
		return (index == -1);
	}

	public Object top() {
		if (isEmpty()) {
			return index;
		} else {
			return Elementos[index];
		}
	}

	/*
	* Recebe o valor a ser inserido e uma opcao de 
	* aumento da pilha
	* se a opcao == 0 entao aumenta constantemente
	* se a opcao != 1 entao aumenta o dobro
	*/
	public void push(Object obj) {
		if(index == Elementos.length-1) {
			Object ElementosAux[] = Elementos;
			if (metodo == 0) {
				System.out.println("Pilha cheia!\nDobrando o tamanho...");
				Elementos = new Object[index*2];
			} else {
				System.out.println("Pilha cheia!\nAumentando o tamanho em 5...");
				Elementos = new Object[index+CONST];
			}

			for (int i = 0; i <= index; i++) {
				Elementos[i] = ElementosAux[i];
			}
		}

		Elementos[++index] = obj;
	}

	public Object pop() {
		if (isEmpty()) {
			return index;
		} else {
			Object temp = Elementos[index];
			Elementos[index] = null;
			index -= 1;
			return temp;				
		}
	}

	public void show() {
		for (int i = 0; i <= index; i++) {
			System.out.println(Elementos[i]);
		}
	}
}