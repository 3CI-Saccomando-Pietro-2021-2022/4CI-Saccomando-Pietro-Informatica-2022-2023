import java.util.*;
public class FrigoriferoTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Frigorifero frigo1 = new Frigorifero();
        System.out.println(frigo1.toString());
        int acc;
        do{
            System.out.println("Inserisci 1 per accendere il frigo 0 per spegnerlo");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            frigo1.accendi();
            System.out.println("Il frigo è acceso");
        }
        if(acc==0){
            frigo1.spegni();
            System.out.println("Il frigo è spento");
        }
    }
}