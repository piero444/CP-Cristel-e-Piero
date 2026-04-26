package CP.pannelli;

import CP.Utenza;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.PasswordNonValidaException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pnlCredenziali extends javax.swing.JPanel {

    private String nome;
    private String cognome;
    private int eta;
    private String password;

    public pnlCredenziali() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cognome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Età = new javax.swing.JSpinner();
        PW = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Cognome");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        Nome.setMaximumSize(new java.awt.Dimension(100, 30));
        Nome.setMinimumSize(new java.awt.Dimension(100, 30));
        Nome.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel2.setText("Età");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));

        Cognome.setMaximumSize(new java.awt.Dimension(100, 30));
        Cognome.setMinimumSize(new java.awt.Dimension(100, 30));
        Cognome.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setText("Nome");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

        Età.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        PW.setText("jPasswordField1");

        jLabel4.setText("Password ");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel5.setText("Min 4 Max 8 (Obbligatorio un carattere grande e un numero)");
        jLabel5.setMaximumSize(new java.awt.Dimension(300, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(300, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(300, 30));

        jButton1.setText("Avanti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Età, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Età, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //  METDODI GET PER L'ASCOLTATORE
    public String getNome() {
        return Nome.getText();
    }
    public String getCognome() {
        return Cognome.getText();
    }
    public int getEta() {
        return (int)Età.getValue();
    }
    public String getPassword() {
        return new String(PW.getPassword());
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //      AVANTI

        nome = Nome.getText();
        cognome = Cognome.getText();
        eta = (int) Età.getValue();
        password = new String(PW.getPassword());

        // CONTROLLARE VALIDITà DI TUTTI I DATI
        try {
            
            Utenza.validazionePW(password);
            Utenza.controllaNome(nome);
            Utenza.controllaCognome(cognome);
            Utenza.controllaEta(eta);
            
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

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cognome;
    private javax.swing.JSpinner Età;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField PW;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
