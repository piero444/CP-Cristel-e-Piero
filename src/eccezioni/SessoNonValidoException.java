package eccezioni;

public class SessoNonValidoException extends Exception {

    public SessoNonValidoException() {
    }

    public SessoNonValidoException(String msg) {
        super(msg);
    }
}
