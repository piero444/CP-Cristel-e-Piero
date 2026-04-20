package eccezioni;

public class PesoNonValidoException extends Exception {

    public PesoNonValidoException() {
    }

    public PesoNonValidoException(String msg) {
        super(msg);
    }
}
