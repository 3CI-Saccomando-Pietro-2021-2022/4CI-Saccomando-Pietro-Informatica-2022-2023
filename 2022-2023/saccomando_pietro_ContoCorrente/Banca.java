import java.util.*;

public class Banca {
    private ArrayList<ContoCorrente> contiCorrenti;
    public Banca() {
        this.contiCorrenti = new ArrayList<ContoCorrente>();
    }
    
    public void aggiungiConto(ContoCorrente conto) {
        contiCorrenti.add(conto);
    }
    public void chiudiConto(ContoCorrente conto){
        contiCorrenti.remove(conto);
    }
    
    public ContoCorrente cercaConto(String nome) {
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getNomeProprietario().equals(nome)) {
                return conto;
            }
        }
        return null;
    }
    
    public void effettuaVersamento(String nomeProprietario, double importo) {
        ContoCorrente conto = cercaConto(nomeProprietario);
        if (conto != null) {
            conto.versamento(importo);
        }
    }
    
    public void effettuaPagamento(String nomeProprietario, double importo) {
        ContoCorrente conto = cercaConto(nomeProprietario);
        if (conto != null) {
            conto.pagamento(importo);
        }
    }
    
    public String visualizzaConto(String nomeProprietario) {
        ContoCorrente conto = cercaConto(nomeProprietario);
        if (conto != null) {
            return conto.visualizzaConto();
        } else {
            return "Conto non trovato";
        }
    }   
}