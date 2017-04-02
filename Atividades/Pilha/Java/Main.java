public class Main {
	public static void main(String[] args) {
		PilhaArray pilha = new PilhaArray(10);
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		
		System.out.println(pilha.isEmpty());
		
		System.out.println("Exibindo os valores");
		pilha.show();
		
		System.out.println("Apagando");
		System.out.println(pilha.pop());

		System.out.println("Exibindo os valores");
		pilha.show();

		System.out.println("Topo");
		System.out.println(pilha.top());
	}
}