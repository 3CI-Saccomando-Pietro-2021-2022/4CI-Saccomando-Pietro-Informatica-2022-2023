import java.util.*;
public class TelevisoreTest{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        int pollici;
        String schermo;
        String colore;
        int acc;
        System.out.println("Inserisci pollici");
        pollici= input.nextInt();
        System.out.println("Inserisci schermo");
        schermo=input.next();
        System.out.println("Inserisci colore");
        colore=input.next();
        Televisore tv1 = new Televisore(pollici, schermo, colore);
        do{
            System.out.println("Digita 0 se vuoi accendere la televisione, 1 se vuoi spegnerla");
            acc=input.nextInt();
        }while(acc!=0 && acc!=1);
        if(acc==0){
            tv1.accendi();
            System.out.println("La tv è accesa");
        }
        if(acc==1){
            tv1.spento();
            System.out.println("La tv è spenta");
        }
        Random rand=new Random();
        tv1.setCanale(rand.nextInt(101));
        tv1.aumentaCanale();
        tv1.diminuisciCanale();
        tv1.setVolume(rand.nextInt(101));
        tv1.aumentaVolume();
        tv1.diminuisciVolume();
        tv1.setLuminosità(rand.nextInt(101));
        tv1.aumentaLuminosità();
        tv1.diminuisciLuminosità();
        System.out.println(tv1.toString());
    }
}