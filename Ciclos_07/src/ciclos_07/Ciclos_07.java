package ciclos_07;
import java.util.Scanner;
public class Ciclos_07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m,n,may,men,i,mul=0;
        System.out.print("Dame un numero: ");
        n=leer.nextInt();
        System.out.print("Dame otro numero: ");
        m=leer.nextInt();
        may=Math.max(n,m);
        men=Math.min(n,m);
        for(i=1;i<=men;i++){
            mul=mul+may;
        }
        System.out.println("");
        System.out.println("La multiplicacion de "+n+" por "+m+" es: "+mul);
    } 
}