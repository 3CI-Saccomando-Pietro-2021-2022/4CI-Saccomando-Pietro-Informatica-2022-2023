import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonVisualizza implements ActionListener{
    private Banca banca;
    private JTextField textNomeProprietario;
    private JTextArea textAreaContoCorrente;
    public ButtonVisualizza(Banca b, JTextField n, JTextArea c) {
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
            textAreaContoCorrente.setText(banca.visualizzaConto(nomeProprietario));
        }else {
            JOptionPane.showMessageDialog(null, "Conto non trovato!", "Errore", JOptionPane.ERROR_MESSAGE); 
        }
    }
}


