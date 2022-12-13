import java.util.*;
public class LavatriceTest{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        Lavatrice lavatrice1= new Lavatrice();
        int acc;
        do{
            System.out.println("Digita 1 se vuoi accendere la lavatrice, 0 se vuoi spegnerla");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            lavatrice1.accendi();
            System.out.println("La lavatrice è accesa");
        }
        if(acc==0){
            lavatrice1.spento();
            System.out.println("La lavatrice è spenta");
        }
    }
}