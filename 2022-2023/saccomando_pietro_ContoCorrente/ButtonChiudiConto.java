import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonChiudiConto implements ActionListener{
    private Banca banca;
    private JTextField textNomeProprietario;
    private JTextArea textAreaContoCorrente;
    public ButtonChiudiConto(Banca b, JTextField n, JTextArea c){
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
            banca.chiudiConto(conto);
            JOptionPane.showMessageDialog(null, "Il conto è stato chiuso e non può essere più utilizzato!", "Chiusura conto", JOptionPane.INFORMATION_MESSAGE);
            textAreaContoCorrente.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "Conto non trovato!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}
