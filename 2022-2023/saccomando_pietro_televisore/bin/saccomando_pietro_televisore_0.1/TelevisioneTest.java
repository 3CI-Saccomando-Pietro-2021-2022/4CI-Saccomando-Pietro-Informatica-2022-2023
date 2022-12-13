import java.util.*;
public class TelevisioneTest{
    public static void main(String args []){
        Scanner input= new Scanner(System.in);
        int acc;
        Televisore tv1 = new Televisore();
        do{
            System.out.println("Digita 1 se vuoi accendere la televisione, 0 se vuoi spegnerla");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            tv1.accendi();
            System.out.println("La tv è accesa");
        }
        if(acc==0){
            tv1.spento();
            System.out.println("La tv è spenta");
        }
    }
}