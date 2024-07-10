package condicional_06;
import java.util.Scanner;
public class Condicional_06 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1,n2,r,m;
        System.out.print("Dame un numero: ");
        n1=leer.nextInt();
        System.out.print("Dame otro numero: ");
        n2=leer.nextInt();
        r=n1/n2;
        m=n1%n2;
        System.out.println("");
        if(m==0){
            System.out.println("La divisio es exacta.");
        }
        else{
            System.out.println("La division no es exata.");
        }
        System.out.println("El cociente de la division es: "+r);
    }
}