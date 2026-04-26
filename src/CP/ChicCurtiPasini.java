package CP;

public class ChicCurtiPasini {

    public static void main(String[] args) {
        Utenza u = new Utenza();
        u.registrazione();
        try {
            // Forza il tema "CrossPlatform" che accetta meglio i colori personalizzati
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            // Qui carichi il tuo pannello o frame
        });
    }

}
