package CP;
//  IMPORT DEI PANNELLI
import CP.pannelli.pnlCredenziali;

//  IMPORT DELLE ECCEZIONI
// PER ORA LE HO MESSE TUTTE;
import eccezioni.AltezzaNonValidaException;
import eccezioni.CirconferenzaVitaNonValidaException;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.LarghezzaSpalleNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.NumeroPiedeNonValidoException;
import eccezioni.TagliaNonValidaException;
import eccezioni.PasswordNonValidaException;

// IMPORT LIBRERIE PER IMPLEMENTARE ActionListener
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listener implements ActionListener {

    private String nome;
    private String cognome;
    private int eta;
    private int altezza;
    private int peso;
    private int npiede;
    private Taglia tagliaAbituale;
    private boolean sesso;
    private double circonferenzaVita;
    private double lunghezzaSpalle;
    private String password;

    // CREO I PANNELLI PER POTER PRENDERE I DATI 
    private pnlCredenziali cre;

    public Listener(pnlCredenziali cre) // DEVO PASSARE QUELLI VERI TRAMITE IL COSTRUTTORE
    {
        this.cre = cre;
    }

    //  CATTURA TUTTI GLI EVENTI DEI VARI PANNELLI PER LA REGISTRAZIONE
    public void actionPerformed(ActionEvent e) {

        // PRENDE IL NOME DEL COMANDO ASSEGNATO NEL COSTRUTTORE DEL PANNELLO CHE GENEREA L'ECCEZIONE
        String comando = e.getActionCommand();

        switch (comando) {
            case "avanti": {
                //   AVANTI PANNELLO CREDENZIALI

                nome = cre.getName();
                cognome = cre.getCognome();
                eta = cre.getEta();
                password = cre.getPassword();

                // CONTROLLARE VALIDITà DI TUTTI I DATI
                try {
                    //  UTILIZZO I METODI STATICI PER LA VALIDAZIONE
                    Utenza.validazionePW(password);
                    Utenza.controllaNome(nome);
                    Utenza.controllaCognome(cognome);
                    Utenza.controllaEta(eta);

                    // I METDI LANCIANO ECCEZIONI 
                } catch (PasswordNonValidaException ex) {
                    //  INSERIRE JOptionPane
                } catch (EtaNonValidaException ex) {
                    //  INSERIRE JOptionPane
                } catch (CognomeNonValidoException ex) {
                    //  INSERIRE JOptionPane
                } catch (NomeNonValidoException ex) {
                    //  INSERIRE JOptionPane
                }

                // SCRIVERE SUI FILE CON IL NOME COGNOME E PW
                // QUINDI CREARE GIA QUI IL FILE
                // O PASSARE QUESTI DATI AL ALRO PANNELLO
                // TANTO QUI STIAMO FACENDO LA REGISTRAZIONE
            }
            break;
            case "registrati": {

            }
            break;
        }
    }

}
