package eccezioni;

public class NumeroPiedeNonValidoException extends Exception {

    public NumeroPiedeNonValidoException() {
    }

    public NumeroPiedeNonValidoException(String msg) {
        super(msg);
    }
}
