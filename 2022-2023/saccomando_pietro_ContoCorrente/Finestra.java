import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {
    private Banca banca;
    private Font font;
    private Container contentPane;
    private JPanel pannello_titolo;
    private JPanel pannello_centrale;
    private JPanel pannello_sinistra;
    private JPanel pannello_destra;
    private JLabel titolo;
    private JTextField casella_nome;
    private JTextArea informazioni_conto;
    private JButton apri;
    private JButton versa;
    private JButton paga;
    private JButton visualizza;
    private JButton chiudi;
    public Finestra() {
        setTitle("Gestione conto corrente");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        banca = new Banca();
        contentPane=this.getContentPane();
        //Creo il pannello superiore con il titolo
        pannello_titolo = new JPanel(new BorderLayout());
        pannello_titolo.setPreferredSize(new Dimension(1000, 300));
        pannello_titolo.setBackground(new Color(255, 255, 120));
        titolo = new JLabel("GESTIONE CONTO CORRENTE");
        titolo.setFont(new Font("Arial", Font.BOLD, 30));
        titolo.setHorizontalAlignment(SwingConstants.CENTER);
        pannello_titolo.add(titolo);
        contentPane.add(pannello_titolo, BorderLayout.NORTH);
        
        //Creo l'area dove verranno visualizzate le informazioni sul conto corrente
        informazioni_conto = new JTextArea(10,1000);
        informazioni_conto.setFont(new Font("Arial", Font.PLAIN, 20));
        informazioni_conto.setBackground(new Color(255, 255, 120));
        contentPane.add(informazioni_conto, BorderLayout.SOUTH);
        
        //Creo il pannello centrale
        pannello_centrale = new JPanel(new GridLayout(1, 2));
        
        //Creo il pannello di sinistra
        pannello_sinistra = new JPanel(new GridLayout(3, 1, 10, 10));
        pannello_sinistra.setBackground(new Color(255, 255, 120));
        casella_nome = new JTextField();
        apri = new JButton("Apri conto");
        apri.setBackground(Color.ORANGE);
        ButtonApriConto a = new ButtonApriConto(banca, casella_nome, informazioni_conto);
        apri.addActionListener(a);
        chiudi = new JButton("Chiudi conto");
        chiudi.setBackground(Color.ORANGE);
        ButtonChiudiConto c = new ButtonChiudiConto(banca, casella_nome, informazioni_conto);
        chiudi.addActionListener(c);
        
        //Aggiungo al pannello di sinistra il JLabel, il JTextField e il bottone apri
        pannello_sinistra.add(casella_nome);
        pannello_sinistra.add(apri);
        pannello_sinistra.add(chiudi);
        
        //Creo il pannello di destra
        pannello_destra = new JPanel(new GridLayout(3, 1, 10, 10));
        pannello_destra.setBackground(new Color(255, 255, 120));
        versa = new JButton("Effettua versamento");
        versa.setBackground(Color.ORANGE);
        ButtonVersamento ver = new ButtonVersamento(banca, casella_nome, informazioni_conto);
        versa.addActionListener(ver);
        paga = new JButton("Effettua pagamento");
        paga.setBackground(Color.ORANGE);
        ButtonPagamento p = new ButtonPagamento(banca, casella_nome, informazioni_conto);
        paga.addActionListener(p);
        visualizza = new JButton("Visualizza conto");
        visualizza.setBackground(Color.ORANGE);
        ButtonVisualizza v = new ButtonVisualizza(banca, casella_nome, informazioni_conto);
        visualizza.addActionListener(v);       
        //Aggiungo al pannello di destra i bottoni
        pannello_destra.add(versa);
        pannello_destra.add(paga);
        pannello_destra.add(visualizza);
        
        //Aggiungo al pannello centrale il pannello di sinistra e di destra
        pannello_centrale.add(pannello_sinistra, BorderLayout.WEST);
        pannello_centrale.add(pannello_destra, BorderLayout.EAST);
        
        //Aggiungo al contentPane il pannello centrale
        contentPane.add(pannello_centrale, BorderLayout.CENTER);
    }
}
