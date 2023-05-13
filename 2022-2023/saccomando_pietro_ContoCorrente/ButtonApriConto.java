import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonApriConto implements ActionListener{
    private Banca banca;
    private JTextField textNomeProprietario;
    private JTextArea textAreaContoCorrente;
    public ButtonApriConto(Banca b, JTextField n, JTextArea c){
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
        if(nomeProprietario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserisci il nome del proprietario!", "Apertura conto", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ContoCorrente conto = new ContoCorrente(nomeProprietario, 0.0);
        if(conto!=null){
            banca.aggiungiConto(conto);
            JOptionPane.showMessageDialog(null, "Il conto è stato aperto con successo!", "Apertura conto", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Il conto è stato chiuso e non si possono più effettuare azioni su di esso!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}
