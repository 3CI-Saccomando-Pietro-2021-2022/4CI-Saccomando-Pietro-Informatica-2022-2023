public class Frigorifero{
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFreezer;
    private double prezzo;
    private boolean acceso;
    private int kWatt;
    private int temperaturaFrigo;
    private int temperaturaFreezer;
    
    public Frigorifero(){
        this.marca="anonimo";
        this.modello="anonimo";
        this.litriFrigo=0;
        this.litriFreezer=0;
        this.prezzo=0.0;
        this.acceso=false;
        this.kWatt=0;
        this.temperaturaFrigo=0;
        this.temperaturaFreezer=0;
    }
    public Frigorifero(String marca, String modello, int litriFrigo, int litriFreezer, double prezzo){
        if(marca==null){
            this.marca="anonimo";
        }else{
            this.marca=marca;
        }
        if(modello==null){
            this.modello="anonimo";
        }else{
            this.modello=modello;
        }
        if(litriFrigo<0){
            this.litriFrigo=0;
        }else{
            this.litriFrigo=litriFrigo;
        }
        if(litriFreezer<0){
            this.litriFreezer=0;
        }else{
            this.litriFreezer=litriFreezer;
        }
        if(prezzo<0.0){
            this.prezzo=0.0;
        }else{
            this.prezzo=prezzo;
        }
        this.acceso=false;
        this.kWatt=0;
        this.temperaturaFrigo=0;
        this.temperaturaFreezer=0;
    }
    public String toString(){
        String out="La marca è: " +this.marca + "\n";
        out+="Il modello è: "+this.modello + "\n";
        out+="I litri che può contenre il frigo sono: " + this.litriFrigo + "\n";
        out+="I litri che può contenere il freezer sono: " + this.litriFreezer + "\n";
        out+="Il frigo costa: " + this.prezzo + "\n";
        out+="Il frigo consuma: "+ this.kWatt + "\n";
        out+="La temperatura del frigo è: " + this.temperaturaFrigo + "\n";
        out+="La temperatura del freezer è: " + this.temperaturaFreezer + "\n";
        return out;
    }
    public void accendi(){
        this.acceso=true;
    }
    public void spegni(){
        this.acceso=false;
    }
    public void setMarca(String marca){
        if(marca==null){
            this.marca="anonimo";
        }else{
            this.marca=marca;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModello(String modello){
       if(modello==null){
            this.modello="anonimo";
       }else{
            this.modello=modello;
       }
    }
    public String getModello(){
        return this.modello;
    }
    public void setLitriFrigo(int litri){
       if(litri<0){
            this.litriFrigo=0;
       }else{
            this.litriFrigo=litri;
       }
    }
    public int getLitriFrigo(){
        return this.litriFrigo;
    }
    public void setLitriFreezer(int litriFreezer){
       if(litriFreezer<0){
            this.litriFreezer=0;
       }else{
            this.litriFreezer=litriFreezer;
       }
    }
    public int getLitriFreezer(){
        return this.litriFreezer;
    }
    public void setPrezzo(double prezzo){
       if(prezzo<0.0){
            this.prezzo=0.0;
       }else{
            this.prezzo=prezzo;
       }
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setKWatt(int kWatt){
        if(kWatt<0){
            this.kWatt=0;
       }else{
            this.kWatt=kWatt;
       }
    }
    public int getKWatt(){
        return this.kWatt;
    }
}