package ciclos_11;
import java.util.Scanner;
public class Ciclos_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,p,i;
        double pot;
        do{
            System.out.print("Dame un numero : ");
            n=leer.nextInt();    
        }while(n<0);
        do{
            System.out.print("A que potencia la quieres elevar : ");
            p=leer.nextInt();
         }while(n<0);
        pot=n;
        for(i=2;i<=p;i++){
            pot=(double)pot*n;
        }
        if(p==0)
            pot=1f;
        System.out.println("");
        System.out.println("El numero "+n+" a la "+p+" es: "+ (int)pot);
    } 
}