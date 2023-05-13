import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonPagamento implements ActionListener{
    private Banca banca;
    private JTextField textNomeProprietario;
    private JTextArea textAreaContoCorrente;

    public ButtonPagamento(Banca b, JTextField n, JTextArea c) {
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
        double importo = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserisci l'importo del pagamento"));
        if (conto.getSaldo()>=importo) {
            banca.effettuaPagamento(nomeProprietario, importo);
            JOptionPane.showMessageDialog(null, "Il pagamento è avvenuto con successo!", "Pagamento", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "L'importo inserito non è valido!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Conto non trovato!", "Errore", JOptionPane.ERROR_MESSAGE);
    }
}
}


