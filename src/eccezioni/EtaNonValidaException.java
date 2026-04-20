package eccezioni;

public class EtaNonValidaException extends Exception {

    public EtaNonValidaException() {
    }

    public EtaNonValidaException(String msg) {
        super(msg);
    }
}
