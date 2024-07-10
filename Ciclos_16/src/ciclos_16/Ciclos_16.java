package ciclos_16;
import java.util.Scanner;
public class Ciclos_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,sda=0,sdb=0,i,may;
        System.out.print("Dame un numero: ");
        a=leer.nextInt();
        System.out.print("Dame otro numero: ");
        b=leer.nextInt();
        may=Math.max(a,b);
        for(i=1;i<=(may/2);i++){
            if(a%i==0){
                sda=sda+i;
            }
            if(b%i==0){
                sdb=sdb+i;
            }
        }
        if(sda==b && sdb==a){
            System.out.println("\nLos Numeros "+ a +" y "+ b +" Son Amigos");
        }
        else{
            System.out.println("\nLos Numeros no son Amigos");
        }
    }  
}