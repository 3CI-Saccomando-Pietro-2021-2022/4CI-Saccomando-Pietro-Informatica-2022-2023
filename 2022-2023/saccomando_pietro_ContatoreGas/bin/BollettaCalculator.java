import java.util.*;
public class BollettaCalculator{
    private ContatoreGas contatore;
    private static final int VALORE_MAX = 9999;
    public BollettaCalculator(){
        contatore = new ContatoreGas();
    }
    public void start(){
        this.descrizioneApp();
        this.prendiInput();;
        this.visualizzaRisultati();
    }
    public void descrizioneApp(){
        System.out.println("Questa app calcola la bolletta del gas");
    }
    public void prendiInput(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Inserisci consumo precedente: ");
            contatore.setRivelazionePrecedente(input.nextDouble());
        }while(contatore.getRivelazionePrecedente()>VALORE_MAX);
        do{
            System.out.println("Inserisci consumo attuale: ");
            contatore.setRivelazioneAttuale(input.nextDouble());
        }while(contatore.getRivelazioneAttuale()>VALORE_MAX);
    }
    public void visualizzaRisultati(){
        System.out.println(contatore.toString());
    }
}
