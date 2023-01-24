public class ContatoreGas{
    private double rivelazionePrec;
    private double rivelazioneAtt;
    public ContatoreGas(){
        this.rivelazionePrec = 0.0;
        this.rivelazioneAtt = 0.0;
    }
    public ContatoreGas(double rivelazionePrec, double rivelazioneAtt){
        if(rivelazionePrec>0.0){
            this.rivelazionePrec = rivelazionePrec;
        }else{
            this.rivelazionePrec = rivelazionePrec;
        }
        if(rivelazioneAtt>0.0){
            this.rivelazioneAtt = rivelazioneAtt;
        }else{
            this.rivelazioneAtt = rivelazioneAtt;
        }
    }
    public void setRivelazionePrecedente(double rivelazionePrec){
        if(rivelazionePrec>0.0){
            this.rivelazionePrec = rivelazionePrec;
        }else{
            this.rivelazionePrec = rivelazionePrec;
        }
    }
    public double getRivelazionePrecedente(){
        return this.rivelazionePrec;
    }
    public void setRivelazioneAttuale(double rivelazioneAtt){
        if(rivelazioneAtt>0.0){
            this.rivelazioneAtt = rivelazioneAtt;
        }else{
            this.rivelazioneAtt = rivelazioneAtt;
        }
    }
    public double getRivelazioneAttuale(){
        return this.rivelazioneAtt;
    }
    public String toString(){
        String out="Il consumo precedente è di: " + this.rivelazionePrec + " metri cubi." + "\n";
        out+="Il consumo attuale è di: " + this.rivelazioneAtt + " metri cubi.";
        return out;
    }
}
