package CP;
//  IMPORTO TUTTI I PANNELLI

import CP.pannelli.pnlRegistrazione;
import CP.pannelli.pnlRegistrazione1;
import CP.pannelli.pnlScelta;
import CP.pannelli.pnlSchermata1;

public class frmPrincipale extends javax.swing.JFrame {

    // DICHIARO LA CLASSE ASCOLTATORE
    private Listener listener;

    // DICHIARO TUTTI I PANNELLI 
    private pnlSchermata1 schermata1;
    private pnlRegistrazione re;
    private pnlRegistrazione1 re1;
    private pnlScelta scelta;

    public frmPrincipale() {
        initComponents();

        // SETTO LA DIMENSIONE E LA POSIZIONE DELLA FINESTRA
        setSize(1000, 800);
        setLocationRelativeTo(null);

        // IMPOSTO IL LAYOUT A NULL PER PORTE METTERE I PANNELLI LIBERAMENTE
        setLayout(null);

        //  COSTRUISCO TUTTI PANNELLI
        schermata1 = new pnlSchermata1();
        re = new pnlRegistrazione();
        re1 = new pnlRegistrazione1();
        scelta = new pnlScelta();

        //  PASSO TUTTI I PANNELLI AL ASCOLTATORE
        listener = new Listener(schermata1, re, re1, scelta);

        // PASSO TRAMITE IL METODO SET L'ASCOLTATORE
        re.setListener(listener);
        re1.setListener(listener);
        schermata1.setListener(listener);

        // AGGIUNGO OGNI PANNELLO AL FRAME
        add(schermata1);
        add(re);
        add(re1);
        add(scelta);

        // SETTO LA POSIZIONE E LA DIMENSIONE DEI PANNELLI
        schermata1.setBounds(0, 0, 1000, 800);
        re.setBounds(0, 0, 1000, 800);
        re1.setBounds(0, 0, 1000, 800);
        scelta.setBounds(0, 0, 1000, 800);

        // SETTO LE VISIBLITà PER FARE IN MODO CHE ALL'INIZIO SI VEDA SOLO SCHERMATA1
        schermata1.setVisible(true);
        re.setVisible(false);
        re1.setVisible(false);
        scelta.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
