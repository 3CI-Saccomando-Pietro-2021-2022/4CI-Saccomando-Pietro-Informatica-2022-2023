
public class ContoCorrente {
    private String nome;
    private double saldo;
    private int numeroConto;
    private static int prossimoNum=1;
    public ContoCorrente(String n, double s) {
        this.nome = n;
        this.saldo = s;
        this.numeroConto = prossimoNum++;
    }

    public void versamento(double importo) {
        this.saldo += importo;
    }

    public void pagamento(double importo) {
            this.saldo -= importo;
    }

    public String visualizzaConto() {
        return "Nome proprietario: " + this.nome + "\n" +
               "Saldo: " + this.saldo + "\n" +
               "Numero conto: " + this.numeroConto + "\n";
    }
    
    public String getNomeProprietario() {
        return this.nome;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public int getNumeroConto() {
        return this.numeroConto;
    }
}