public class Bagaglio{
    private static final double MAX_WEIGHT=20.00;
    private double weight;
    public Bagaglio(){
        this.weight=0.0;
    }
    public Bagaglio(double w){
        this.weight=w;
    }
    public void setWeight(double v){
        if(v>0){
            this.weight=v;
        }else{
            this.weight=0;
        }
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean sovrapprezzo(){
        return(this.weight>MAX_WEIGHT);
    }
    public String toString(){
        String out="";
        out+="Il bagaglio pesa: " + this.weight + "kg";
        return out;
    }
}
