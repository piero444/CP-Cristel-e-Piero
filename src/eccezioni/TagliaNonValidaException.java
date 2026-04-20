package eccezioni;

public class TagliaNonValidaException extends Exception {

    public TagliaNonValidaException() {
    }

    public TagliaNonValidaException(String msg) {
        super(msg);
    }
}
