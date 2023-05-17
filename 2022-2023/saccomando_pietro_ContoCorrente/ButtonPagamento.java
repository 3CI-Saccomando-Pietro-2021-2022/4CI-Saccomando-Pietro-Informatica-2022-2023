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
            textAreaContoCorrente.setText(banca.visualizzaConto(nomeProprietario));
        } else {
            JOptionPane.showMessageDialog(null, "L'importo inserito non è valido!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Il conto è stato chiuso o non è mai stato aperto!", "Errore", JOptionPane.ERROR_MESSAGE);
    }
}
}


