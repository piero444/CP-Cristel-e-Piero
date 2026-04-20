package eccezioni;

public class NomeNonValidoException extends Exception {

    public NomeNonValidoException() {
        
    }
    
    public NomeNonValidoException(String msg) {
        super(msg);
    }
}
