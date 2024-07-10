package condicional_08;
import java.util.Scanner;
public class Condicional_08 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double n,r;
        System.out.print("Dame un numero: ");
        n=leer.nextDouble();
        if((n%2)==0){
            r=Math.pow(n,2);
        }
        else{
            r=Math.pow(n,3);
        }
        System.out.println("El resultado es: "+r);
    }
}