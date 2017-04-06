import java.lang.Exception;

public class EPilhaVazia extends Exception{
	public EPilhaVazia() {
	}

	public EPilhaVazia(String mensagem) {
		super(mensagem);
	}
}