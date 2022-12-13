import java.util.*;
public class LavatriceTest{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int acc;
        System.out.println("Inserisci marca");
        String marca=input.next();
        System.out.println("Inserisci modello");
        String modello=input.next();
        System.out.println("Inserisci prezzo");
        double prezzo=input.nextDouble();
        Lavatrice lavatrice1 = new Lavatrice(marca, modello, prezzo);
        System.out.println("marca: "+lavatrice1.getMarca());
        System.out.println("modello: "+lavatrice1.getModello());
        System.out.println("prezzo: "+lavatrice1.getPrezzo());
        do{
            System.out.println("Digita 1 se vuoi accendere la lavatrice, 0 se vuoi spegnerla");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            lavatrice1.accendi();
            System.out.println("La lavatrice è accesa");
            System.out.println("Inserisci programma");
            int programma=input.nextInt();
            lavatrice1.setProgramma(programma);
            System.out.println("Il programma impostato è: "+lavatrice1.getProgramma());
            lavatrice1.aumentaProgramma();
            System.out.println("Il programma è stato aumentato a: "+lavatrice1.getProgramma());
            lavatrice1.diminuisciProgramma();
            System.out.println("Il programma è stato diminuito a: "+lavatrice1.getProgramma());
            System.out.println("Inserisci temperatura");
            int temperatura=input.nextInt();
            lavatrice1.setTemperatura(temperatura);
            System.out.println("La temperatura è stata impostata a :"+lavatrice1.getTemperatura()+" gradi");
            lavatrice1.aumentaTemperatura();
            System.out.println("La temperatura è stata aumentata a: "+lavatrice1.getTemperatura()+" gradi");
            lavatrice1.diminuisciTemperatura();
            System.out.println("La temperatura è stata diminuita a: "+lavatrice1.getTemperatura()+" gradi");
            System.out.println("Inserisci giri della centrifuga");
            int giri=input.nextInt();
            lavatrice1.setGiri(giri);
            System.out.println("I giri della centrifuga sono :"+lavatrice1.getGiri()+" giri");
            lavatrice1.aumentaGiri();
            System.out.println("I giri della centrifuga sono stati aumentati a: "+lavatrice1.getGiri()+" giri");
            lavatrice1.diminuisciGiri();
            System.out.println("I giri della centrifuga sono stati diminuiti a: "+lavatrice1.getGiri()+" giri");
            System.out.println("Inserisci kg che può contenere");
            int kg=input.nextInt();
            lavatrice1.setKg(kg);
            System.out.println("I kg che può contenere sono :"+lavatrice1.getKg()+" kg");
            System.out.println("Inserisci il tempo di lavaggio (in minuti)");
            int tempo=input.nextInt();
            lavatrice1.setTempo(tempo);
            System.out.println("Il tempo impostato è :"+lavatrice1.getTempo()+" minuti");
            lavatrice1.aumentaTempo();
            System.out.println("Il tempo è aumentato di: "+lavatrice1.getTempo()+" minuti");
            lavatrice1.diminuisciTempo();
            System.out.println("Il tempo è diminuito di: "+lavatrice1.getTempo()+" minuti");
            System.out.println("IN CONCLUSIONE!" + "\n" + lavatrice1.toString());
        }
        if(acc==0){
            lavatrice1.spento();
            System.out.println("La lavatrice è spenta");
        }
        
    }
}