import java.util.*;
public class BagaglioPrezzoCalculator{
    private static final double COSTO_PER_KG=5.00;
    private static final double SOVRAPPREZZO=10.00;
    private Bagaglio bag;
    public BagaglioPrezzoCalculator(){
        bag=new Bagaglio();
    }
    public void start(){
        this.descriviAttività();
        this.prendiInput();
        this.calcolaPrezzo();
        this.visualizzaRisultati();
    }
    public double calcolaPrezzo(){
        if(bag.sovrapprezzo()){
            return((bag.getWeight() * this.COSTO_PER_KG) + this.SOVRAPPREZZO);
        }else{
            return(bag.getWeight() * this.COSTO_PER_KG);
        }
    }
    public void descriviAttività(){
        System.out.println("Questo programma calcola il peso del bagaglio");
    }
    public void prendiInput(){
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci peso");
        bag.setWeight(input.nextDouble());
    }
    public void visualizzaRisultati(){
        System.out.println("Costo: "+ calcolaPrezzo());
    }
}
