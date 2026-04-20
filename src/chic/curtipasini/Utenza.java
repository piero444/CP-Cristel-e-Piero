
package chic.curtipasini;
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
    
    Utenza()
    {
        
    }
    
    public void registrazione()
    {
        try
        {
            nome= "Cristel";  //     GESTIRE TUTTI QUESTI ERRORI TRAMITE ECCEZIONI  
            cognome= "Pasini";  // controllo no numeri caratteri strani ecc..
            eta=17;   // da 0 a 99
            altezza=102;  // da 0 a 250
            peso=50;    // da 0 a 300
            npiede=37;  // da 15 a 50 EU
            tagliaAbituale=tagliaAbituale.S ;  //  S M L XL XXL
            sesso=true; // M - 0 F - 1  Bonus (Frigorifero)
            circonferenzaVita=100;   // da 0 a 120
            lunghezzaSpalle=120; 
            FileWriter f = new FileWriter("src/data/utenti/"+nome+cognome+eta+".txt");
            PrintWriter fOUT = new PrintWriter(f);
            
            
            fOUT.println(peso);
            fOUT.println(npiede);
            fOUT.println(tagliaAbituale);
            fOUT.println(sesso);
            fOUT.println(circonferenzaVita);
            fOUT.println(lunghezzaSpalle);
            
            
            fOUT.flush();
            fOUT.close();
            
        }
        catch(IOException e)
        {
            System.out.println("Errore nell'apertura del file. ");
        }
        
        
        
        
    }
    
    
    public void leggiUtente()
    {
        
        try
        {
            FileReader f = new FileReader(nome+cognome+eta+".txt");
            BufferedReader fIN = new BufferedReader(f);
            
            
            peso=Integer.parseInt(fIN.readLine());
            npiede=Integer.parseInt(fIN.readLine());
            tagliaAbituale=Taglia.valueOf(fIN.readLine());
            sesso=Boolean.parseBoolean(fIN.readLine());
            circonferenzaVita=Integer.parseInt(fIN.readLine());
            lunghezzaSpalle=Integer.parseInt(fIN.readLine());
            
            
            
        }
        catch(IOException e)
        {
            System.out.println("Errore nell'apertura del file. ");
        }
        
        
        
        
    }
    
    
    
    
    public void accedi() // i dati li prenderemo dal jtextfild 
    {
        nome= "Cristel";  
        cognome= "Pasini"; 
        eta=18;
        password="Cristel18";
        File f = new File(nome+cognome+eta+".txt");

        if (f.exists()) {  //  Il file esiste
            try
            {
                FileReader f1 = new FileReader(nome+cognome+eta+".txt");
                BufferedReader fIN = new BufferedReader(f1);
                
                for(int i=0;i<6;i++)
                    fIN.skip(fIN.readLine().length());
                
                String p=fIN.readLine();
                if(p.equals(password))
                {
                    // Accesso consentito
                }
                else
                {
                    // Accesso negato
                }
            }
            catch(IOException e)
                    {
                        System.out.println("Errore nell'apertura del file. ");
                    }
        } else {// File non trovato
            // eccezione
        }
    }
    

}
