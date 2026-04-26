package CP;

import eccezioni.AltezzaNonValidaException;
import eccezioni.CirconferenzaVitaNonValidaException;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.LarghezzaSpalleNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.NumeroPiedeNonValidoException;
import eccezioni.TagliaNonValidaException;
import eccezioni.PasswordNonValidaException;

import java.io.*;

public class Utenza {

    private String nome;  //     GESTIRE TUTTI QUESTI ERRORI TRAMITE ECCEZIONI  
    private String cognome;  // controllo no numeri caratteri strani ecc..
    private int eta;   // da 0 a 99
    private int altezza;  // da 0 a 250
    private int peso;    // da 0 a 300
    private int npiede;  // da 15 a 50 EU
    private Taglia tagliaAbituale;  //  S M L XL XXL
    private boolean sesso; // M - 0 F - 1  Bonus (Frigorifero)
    private double circonferenzaVita;   // da 0 a 120
    private double lunghezzaSpalle;  // da 0 a 180

    private String password;  // min 4 max 8 (carattere grande e un numero)
    private static final int minPW = 4;
    private static final int maxPW = 8;

    Utenza() {

    }

    public static boolean validazionePW(String pw) throws PasswordNonValidaException {
        if (pw.length() > minPW && pw.length() < maxPW) {
            // DIMENSIONE VALIDA
            int t = 0;    // VARIABILE CONTROLLO PRESENZA DI ALMENO UN CARATTERE MAIUSCOLO
            int t1 = 0;
            for (int i = 0; i < pw.length(); i++) {
                if (Character.isUpperCase(pw.charAt(i))) // è MAIUSCOLO ?
                {
                    // SI è MAIUSCOLA
                    t = 1;
                }
                if (Character.isDigit(pw.charAt(i))) //  è UN NUMERO ?
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

    public void registrazione() {

        nome = "Cristel";  //     GESTIRE TUTTI QUESTI ERRORI TRAMITE ECCEZIONI  
        cognome = "Pasini";  // controllo no numeri caratteri strani ecc..
        eta = 17;   // da 0 a 99
        altezza = 102;  // da 0 a 250
        peso = 50;    // da 0 a 300
        npiede = 37;  // da 15 a 50 EU
        tagliaAbituale = tagliaAbituale.S;  //  S M L XL XXL
        sesso = true; // M - 0 F - 1  Bonus (Frigorifero)
        circonferenzaVita = 100;   // da 0 a 120
        lunghezzaSpalle = 120;
        password = "Bastarda8";

        try {
            FileWriter f = new FileWriter("src/data/utenti/Registrati/" + nome + cognome + eta + ".txt");
            PrintWriter fOUT = new PrintWriter(f);

            fOUT.println(peso);
            fOUT.println(npiede);
            fOUT.println(tagliaAbituale);
            fOUT.println(sesso);
            fOUT.println(circonferenzaVita);
            fOUT.println(lunghezzaSpalle);
            fOUT.println(password);

            fOUT.flush();
            fOUT.close();
        } catch (IOException e)// INPUT / OUTPUT
        {
            System.out.println("Errore di input output del file. ");
        } catch (Exception e)// ECCEZIONE GENERALE
        {
            System.out.println("Si è riscontrato un problema ");
        }

        try {
            FileWriter f = new FileWriter("src/data/utenti/Accedi/" + nome + cognome + eta + ".txt");
            PrintWriter fOUT = new PrintWriter(f);
            fOUT.println(password);

            fOUT.flush();
            fOUT.close();
        } catch (IOException e) // INPUT / OUTPUT
        {
            System.out.println("Errore di input output del file. ");
        } catch (Exception e) // ECCEZIONE GENERALE
        {
            System.out.println("Si è riscontrato un problema ");
        }

    }

    public void leggiUtente() {

        try {
            FileReader f = new FileReader(nome + cognome + eta + ".txt");
            BufferedReader fIN = new BufferedReader(f);

            peso = Integer.parseInt(fIN.readLine());
            npiede = Integer.parseInt(fIN.readLine());
            tagliaAbituale = Taglia.valueOf(fIN.readLine());
            sesso = Boolean.parseBoolean(fIN.readLine());
            circonferenzaVita = Integer.parseInt(fIN.readLine());
            lunghezzaSpalle = Integer.parseInt(fIN.readLine());

        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file. ");
        }

    }

    public void accedi() // i dati li prenderemo dal jtextfild 
    {
        nome = "Cristel";
        cognome = "Pasini";
        eta = 18;
        password = "Cristel18";
        File f = new File("src/data/utenti/Accedi/" + nome + cognome + eta + ".txt");

        if (f.exists()) {  //  Il file esiste
            try {
                FileReader f1 = new FileReader("src/data/utenti/Accedi/" + nome + cognome + eta + ".txt");
                BufferedReader fIN = new BufferedReader(f1);

                for (int i = 0; i < 6; i++) {
                    fIN.skip(fIN.readLine().length());
                }

                String p = fIN.readLine();
                if (p.equals(password)) {
                    // Accesso consentito
                } else {
                    // Accesso negato
                }
            } catch (IOException e) {
                System.out.println("Errore nell'apertura del file. ");
            }
        } else {// File non trovato
            // eccezione
        }
    }

    // IMPLEMENTAZIONE DEI METODI(INTERFACCIA) PER I CONTROLLI 
    public static void controllaNome(String nome) throws NomeNonValidoException {
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
    public static void controllaCognome(String cognome) throws CognomeNonValidoException {
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
    public static void controllaAltezza(int altezza) throws AltezzaNonValidaException {
        if (altezza < 0 || altezza > 250) {
            throw new AltezzaNonValidaException();
        }
    }

    // da 0 a 120
    public static void controllaCirconferenza(int circonferenza) throws CirconferenzaVitaNonValidaException {

    }

    // da 0 a 99
    public static void controllaEta(int eta) throws EtaNonValidaException {

    }

    // da 0 a 120
    public static void controllaLarghezzaS(int larghezza) throws LarghezzaSpalleNonValidaException {

    }

    // da 15 a 50 EU
    public static void controllaNumeroP(int numero) throws NumeroPiedeNonValidoException {

    }

    public static void controllaTaglia(Taglia taglia) throws TagliaNonValidaException {

    }

}
