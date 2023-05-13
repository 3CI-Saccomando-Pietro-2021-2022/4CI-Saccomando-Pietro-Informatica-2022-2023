import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonVersamento implements ActionListener{
    private Banca banca;
    private JTextField textNomeProprietario;
    private JTextArea textAreaContoCorrente;

    public ButtonVersamento(Banca b, JTextField n, JTextArea c) {
        this.banca = b;
        if(n!=null){
            textNomeProprietario = n;
        }
        if(c!=null){
            textAreaContoCorrente = c;
        }
    }

    public void actionPerformed(ActionEvent e) {
        String nomeProprietario = textNomeProprietario.getText();
        ContoCorrente conto = banca.cercaConto(nomeProprietario);
        if (conto != null) {
            double importo = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserisci l'importo del versamento"));
            banca.effettuaVersamento(nomeProprietario, importo);
            JOptionPane.showMessageDialog(null, "Il versamento è avvenuto con successo!", "Versamento", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Conto non trovato!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}


