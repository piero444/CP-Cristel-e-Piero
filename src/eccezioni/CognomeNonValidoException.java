package eccezioni;

public class CognomeNonValidoException extends Exception {

    public CognomeNonValidoException() {
    }

    public CognomeNonValidoException(String msg) {
        super(msg);
    }
}
