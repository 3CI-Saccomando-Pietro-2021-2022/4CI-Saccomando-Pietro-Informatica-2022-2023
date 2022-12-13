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
}