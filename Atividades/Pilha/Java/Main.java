public class Main {
	public static void main(String[] args) {
		PilhaArray pilha = new PilhaArray(3);
		
		pilha.push(1);
		System.out.println("Topo");
		System.out.println(pilha.top());

		pilha.push(2);
		System.out.println("Topo");
		System.out.println(pilha.top());
		
		pilha.push(3);
		System.out.println("Topo");
		System.out.println(pilha.top());
		
		pilha.push(4);
		System.out.println("Topo");
		System.out.println(pilha.top());
		
		System.out.println(pilha.isEmpty());
		
		System.out.println("Exibindo os valores");
		pilha.show();
		
		System.out.println("Apagando");
		System.out.println(pilha.pop());

		System.out.println("Exibindo os valores");
		pilha.show();
	}
}