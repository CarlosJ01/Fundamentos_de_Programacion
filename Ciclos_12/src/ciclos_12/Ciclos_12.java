package ciclos_12;
import java.util.Scanner;
public class Ciclos_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2=0,dif,difMay=0;
        do{
            System.out.print("Dame un numero: ");
            n1=leer.nextInt();
            dif=n2-n1;
            if(dif<0){
                dif=dif*(-1);
            }
            if(dif>=difMay){
                difMay=dif;
            }
            n2=n1;
        }while(n1!=0);
        System.out.println("");
        System.out.println("La diferencia mayor entre 2 numeros consecutivos fue: " + difMay);
    } 
}