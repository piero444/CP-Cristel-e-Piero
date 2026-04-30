package CP;

import eccezioni.AltezzaNonValidaException;
import eccezioni.CirconferenzaVitaNonValidaException;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.LarghezzaSpalleNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.TagliaNonValidaException;
import eccezioni.PasswordNonValidaException;
import eccezioni.PesoNonValidoException;

import java.io.*;

public class Utenza {

    private String nome;  //     GESTIRE TUTTI QUESTI ERRORI TRAMITE ECCEZIONI  
    private String cognome;  // controllo no numeri caratteri strani ecc..
    private int eta;   // da 0 a 99
    private int altezza;  // da 0 a 250
    private int peso;    // da 0 a 300
    private Taglia tagliaAbituale;  //  S M L XL XXL
    private boolean sesso; // M - 0 F - 1  Bonus (Frigorifero)
    private double circonferenzaVita;   // da 0 a 120
    private double lunghezzaSpalle;  // da 0 a 180

    // NUOVO ATTRIBUTO PER AUMENTO O PERDITA PESO
    
    
    private String password;  // min 4 max 8 (carattere grande e un numero)
    private static final int minPW = 4;
    private static final int maxPW = 8;

    
    //  STABILIRE SE UTILE IL COSTRUTTORE CON TUTTI I PARAMETRI
    public Utenza(String nome, String cognome, int eta, int altezza, int peso, Taglia tagliaAbituale, boolean sesso, double circonferenzaVita, double lunghezzaSpalle, String password)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
        this.peso = peso;
        this.tagliaAbituale = tagliaAbituale;
        this.sesso = sesso;
        this.circonferenzaVita = circonferenzaVita;
        this.lunghezzaSpalle = lunghezzaSpalle;
        this.password = password;
        
    }

    Utenza() {
    }
        

    public boolean validazionePW() throws PasswordNonValidaException {
        if (password.length() > minPW && password.length() < maxPW) {
            // DIMENSIONE VALIDA
            int t = 0;    // VARIABILE CONTROLLO PRESENZA DI ALMENO UN CARATTERE MAIUSCOLO
            int t1 = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) // è MAIUSCOLO ?
                {
                    // SI è MAIUSCOLA
                    t = 1;
                }
                if (Character.isDigit(password.charAt(i))) //  è UN NUMERO ?
                {
                    // SI è UN NUMERO
                    t1 = 1;
                }
            }

            if (t == 1 && t1 == 1) {
                // TUTTO GIUSTO PASSWORD VALIDA

                return true;
            } else {
                //  DIMENSIONE CORRETTA MA MACA O IL NUMERO O IL CARATTERE MAIUSCOLO
                throw new PasswordNonValidaException("Manca il numero o il carattere maiuscolo. ");

            }
        } else {
            // DIMENSIONE NON VALIDA
            //      EXCEPTION
            throw new PasswordNonValidaException("Dimensione non valida. ");
        }
    }

    // IMPLEMENTAZIONE DEI METODI(INTERFACCIA) PER I CONTROLLI 
    public void controllaNome() throws NomeNonValidoException {
        int t = 0; // è PRESENTE UN NUMERO
        for (int i = 0; i < nome.length(); i++) {

            if (Character.isDigit(nome.charAt(i))) //  è UN NUMERO ?
            {
                // SI è UN NUMERO
                t = 1;
            }
        }

        if (t == 0 && !nome.matches(".*[|!£$%&/()=?'^*+\\\\[\\\\]@#§°\\\\-_;,:.`~].*"))// puoi controllare anche i numeri 0-9
        {
            //  NESSUN CARATTERE SPECIALE O NUMERO TROVATO (VA BENE)

        }

    }

    // controllo no numeri caratteri strani ecc..
    public void controllaCognome() throws CognomeNonValidoException {
        int t = 0; // è PRESENTE UN NUMERO
        for (int i = 0; i < cognome.length(); i++) {

            if (Character.isDigit(cognome.charAt(i))) //  è UN NUMERO ?
            {
                // SI è UN NUMERO
                t = 1;
            }
        }

        if (t == 0 && !cognome.matches(".*[|!£$%&/()=?'^*+\\\\[\\\\]@#§°\\\\-_;,:.`~].*"))// puoi controllare anche i numeri 0-9
        {
            //  NESSUN CARATTERE SPECIALE O NUMERO TROVATO (VA BENE)

        }
    }

    //altezza da 0 a 250
    public void controllaAltezza() throws AltezzaNonValidaException {
        if (altezza < 0 || altezza > 250) {
            throw new AltezzaNonValidaException();
        }
    }
    
    public void controllaPeso() throws PesoNonValidoException {
        if (peso < 0 || peso > 250) {
            throw new PesoNonValidoException();
        }
    }

    // da 0 a 120
    public static void controllaCirconferenza(int circonferenza) throws CirconferenzaVitaNonValidaException {

    }

    // da 0 a 99
    public void controllaEta() throws EtaNonValidaException {

    }

    // da 0 a 120
    public void controllaLarghezzaS() throws LarghezzaSpalleNonValidaException {

    }

    public void controllaTaglia() throws TagliaNonValidaException {

    }

    //  METODI GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Taglia getTagliaAbituale() {
        return tagliaAbituale;
    }

    public void setTagliaAbituale(Taglia tagliaAbituale) {
        this.tagliaAbituale = tagliaAbituale;
    }

    public boolean isSesso() {
        return sesso;
    }

    public void setSesso(boolean sesso) {
        this.sesso = sesso;
    }

    public double getCirconferenzaVita() {
        return circonferenzaVita;
    }

    public void setCirconferenzaVita(double circonferenzaVita) {
        this.circonferenzaVita = circonferenzaVita;
    }

    public double getLunghezzaSpalle() {
        return lunghezzaSpalle;
    }

    public void setLunghezzaSpalle(double lunghezzaSpalle) {
        this.lunghezzaSpalle = lunghezzaSpalle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
