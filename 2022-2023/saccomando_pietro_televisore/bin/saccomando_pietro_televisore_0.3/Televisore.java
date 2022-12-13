public class Televisore{
    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminosità;
    private boolean acceso;
    
    public Televisore(){
        this.pollici=0;
        this.schermo=" ";
        this.colore=" ";
        this.canale=1;
        this.volume=0;
        this.luminosità=0;
        this.acceso=false;
    }
    public Televisore(int pollici, String schermo, String colore){
        this.pollici=pollici;
        this.schermo=schermo;
        this.colore=colore;
        this.canale=1;
        this.volume=0;
        this.luminosità=0;
        this.acceso=false;
    }
    public void accendi(){
        this.acceso=true;
    }
    public void spento(){
        this.acceso=false;
    }
    public void setPollici(int pollici){
        if(pollici>0){
            this.pollici=pollici;
        }else{
            this.pollici=0;
        }
    }
    public int getPollici(){
        return this.pollici;
    }
    public void setSchermo(String schermo){
        this.schermo=schermo;
    }
    public String getSchermo(){
        return this.schermo;
    }
    public void setColore(String colore){
        this.colore=colore;
    }
    public String getColore(){
        return this.colore;
    }
    public void setCanale(int canale){
        if(canale>=1){
            this.canale=canale;
        }else{
            this.canale=0;
        }
    }
    public int getCanale(){
        return this.canale;
    }
    public void aumentaCanale(){
        this.canale++;
    }
    public void diminuisciCanale(){
        if(this.canale>1){
            this.canale--;
        }else{
            this.canale=1;
        }
    }
    public String toString(){
        String out="La tv ha "+ this.pollici +"pollici"+"\n";
        out+="lo schermo è "+this.schermo+"\n";
        out+="la tv è "+this.colore+"\n";
        out+="la tv è sul canale "+this.canale;
        return out;
    }
}