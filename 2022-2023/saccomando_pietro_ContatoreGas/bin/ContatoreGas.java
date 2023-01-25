public class ContatoreGas{
    private double rilevazionePrec;
    private double rilevazioneAtt;
    private static final double COSTO = 1.2188;
    public ContatoreGas(){
        this.rilevazionePrec = 0.0;
        this.rilevazioneAtt = 0.0;
    }
    public ContatoreGas(double rilevazionePrec, double rilevazioneAtt){
        this.rilevazionePrec = rilevazionePrec;
        this.rilevazioneAtt = rilevazioneAtt;
    }
    public void setConsumoPrecedente(double rilevazionePrec){
        this.rilevazionePrec = rilevazionePrec;
    }
    public double getConsumoPrecedente(){
        return this.rilevazionePrec;
    }
    public void setConsumoAttuale(double rilevazioneAtt){
        this.rilevazioneAtt = rilevazioneAtt;}
    }
    public double getConsumoAttuale(){
        return this.rilevazioneAtt;
    }
    public double rilevazionePrecedente(){
        return this.rilevazionePrec*COSTO;
    }
    public double rilevazioneAttuale(){
        return this.rilevazioneAtt*COSTO;
    }
    public String toString(){
        String out="Il consumo precedente è di: " + this.rilevazionePrec + " metri cubi." + "\n";
        out+="Il consumo attuale è di: " + this.rilevazioneAtt + " metri cubi." + "\n";
        out+="La bolletta precedente è di :" + rilevazionePrecedente() + " €" + "\n";
        out+="La bolletta attuale è di :" + rilevazioneAttuale() + " €" + "\n";
        return out;
    }
}
