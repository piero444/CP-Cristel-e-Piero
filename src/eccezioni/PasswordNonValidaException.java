
package eccezioni;

public class PasswordNonValidaException extends Exception{

    public PasswordNonValidaException() {
    }

    public PasswordNonValidaException(String msg) {
        super(msg);
    }
}
