import java.io.*;

public class InvalidNoException extends Exception {

	public InvalidNoException() {
	}

	public InvalidNoException(String mensagem) {
		super(mensagem);
	}

}