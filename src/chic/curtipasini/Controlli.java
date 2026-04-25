
package chic.curtipasini;

import eccezioni.AltezzaNonValidaException;
import eccezioni.CirconferenzaVitaNonValidaException;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.LarghezzaSpalleNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.NumeroPiedeNonValidoException;
import eccezioni.TagliaNonValidaException;

public interface Controlli {    //   PER ORA INUTILE COME ME
     
    // TUTTI I METODI USATI PER I CONTROLLI CON LE RISPETTIVE ECCEZIONI
    
    public void controllaNome(String nome) throws NomeNonValidoException;
    public void controllaCognome(String cognome) throws CognomeNonValidoException;
    public void controllaAltezza (int altezza) throws AltezzaNonValidaException;
    public void controllaCirconferenza (int circonferenza) throws CirconferenzaVitaNonValidaException;
    public void controllaEta (int eta) throws EtaNonValidaException;
    public void controllaLarghezzaS (int larghezza) throws LarghezzaSpalleNonValidaException;
    public void controllaNumeroP (int numero) throws NumeroPiedeNonValidoException;
    public void controllaTaglia (Taglia taglia) throws TagliaNonValidaException;
    
    
    
}
