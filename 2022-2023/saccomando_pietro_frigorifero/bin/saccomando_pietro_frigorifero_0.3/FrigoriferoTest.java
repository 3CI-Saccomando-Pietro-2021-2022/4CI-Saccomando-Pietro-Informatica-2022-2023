import java.util.*;
public class FrigoriferoTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String marca="Samsung";
        String modello="pro";
        int litriFrigo=20;
        int litriFreezer=10;
        double prezzo=499.99;
        Frigorifero frigo1 = new Frigorifero(marca, modello, litriFrigo, litriFreezer, prezzo);
        int acc;
        do{
            System.out.println("Inserisci 1 per accendere il frigo 0 per spegnerlo");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            frigo1.accendi();
            System.out.println("Il frigo è acceso");
            frigo1.setMarca("Samsung");
            System.out.println("marca: "+frigo1.getMarca());
        }
        if(acc==0){
            frigo1.spegni();
            System.out.println("Il frigo è spento");
        }
    }
}