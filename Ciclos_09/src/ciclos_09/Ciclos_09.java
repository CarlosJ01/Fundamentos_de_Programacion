package ciclos_09;
import java.util.Scanner;
public class Ciclos_09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,cn;
        double fac;
        System.out.print("Dame un numero: ");
        n=leer.nextInt();
        if(n!=0){
            fac=n;
            cn=n-1;
            while(cn>=1){
                fac=(double)fac*cn;
                cn--;
            }
            System.out.println("El factorial del numero "+n+" es: "+(int)fac);
        }
        else{
            System.out.println("El factorial del numero "+n+" es: 1");
        }
    }
}