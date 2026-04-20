package eccezioni;

public class AltezzaNonValidaException extends Exception {

    public AltezzaNonValidaException() {
    }

    public AltezzaNonValidaException(String msg) {
        super(msg);
    }
}
