public class Lavatrice{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private  int kg;
    private boolean acceso;
    private double tempo;
    public Lavatrice(){
        this.marca="anonimo";
        this.modello="anonimo";
        this.prezzo=0.0;
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public Lavatrice(String m, String mod, double p){
        if(m!=null){
            this.marca=m;
        }else{
            this.marca="anonimo";
        }
        if(mod!=null){
            this.modello=mod;
        }else{
            this.modello="anonimo";
        }
        if(p<0.0){
            this.prezzo=0.0;
        }else{
            this.prezzo=p;
        }
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public void accendi(){
        this.acceso=true;
    }
    public void spento(){
        this.acceso=false;
    }
    public void setMarca(String m){
        if(m==null){
            this.marca="anonimo";
        }else{
            this.marca=m;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModello(String mod){
        if(mod==null){
            this.modello="anonimo";
        }else{
            this.modello=mod;
        }
    }
    public String getModello(){
        return this.modello;
    }
    public void setPrezzo(double p){
        if(p<0){
            this.prezzo=0.0;
        }else{
            this.prezzo=p;
        }
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setProgramma(int prog){
        if(prog<0){
            this.programma=0;
        }else{
            this.programma=prog;
        }
    }
    public void aumentaProgramma(){
        this.programma++;
    }
    public void diminuisciProgramma(){
        this.programma--;
    }
    public int getProgramma(){
        return this.programma;
    }
    public void setTemperatura(int temp){
        if(temp<0){
            this.temperatura=0;
        }else{
            this.temperatura=temp;
        }
    }
    public void aumentaTemperatura(){
        this.temperatura++;
    }
    public void diminuisciTemperatura(){
        this.temperatura--;
    }
    public int getTemperatura(){
        return this.temperatura;
    }
    public void setGiri(int giri){
        if(giri<0){
            this.giriCentrifuga=0;
        }else{
            this.giriCentrifuga=giri;
        }
    }
    public void aumentaGiri(){
        this.giriCentrifuga++;
    }
    public void diminuisciGiri(){
        this.giriCentrifuga--;
    }
    public int getGiri(){
        return this.giriCentrifuga;
    }
     public void setKg(int kg){
        if(kg<0){
            this.kg=0;
        }else{
            this.kg=kg;
        }
    }
    public int getKg(){
        return this.kg;
    }
    public void setTempo(int tempo){
        if(tempo<0.0){
            this.tempo=tempo;
        }else{
            this.tempo=tempo;
        }
    }
    public void aumentaTempo(){
        this.tempo+=5;
    }
    public void diminuisciTempo(){
        this.tempo-=5;
    }
    public double getTempo(){
        return this.tempo;
    }
    public String toString(){
        String out="La lavatrice è di marca: "+ this.marca +"\n";
        out+="il modello è: "+this.modello+"\n";
        out+="costa: "+this.prezzo+"\n";
        out+="il programma impostato è: "+this.programma+"\n";
        out+="la temperatura impostata è: "+this.temperatura+"\n";
        out+="i giri della centrifuga sono: "+this.giriCentrifuga+"\n";
        out+="i kg che può contenre la lavatrice sono: "+this.kg+"\n";
        out+="il tempo che ci impiega è di: "+this.tempo+" minuti";
        return out;
    }
}
    