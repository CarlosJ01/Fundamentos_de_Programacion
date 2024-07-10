package condicional_09;
import java.util.Scanner;
public class Condicional_09 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1,n2,m;
        System.out.println("Dame un numero(Que sea el mayor): ");
        n1=leer.nextInt();
        System.out.println("Dame orto numero: ");
        n2=leer.nextInt();
        m=(n1%n2);
        if(m==0)
            System.out.println("El numero "+ n1 +" es multiplo de "+n2);
        else
            System.out.println("Ninguno es multiplo");
    }
}