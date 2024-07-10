package condicional_04;
import java.util.Scanner;
public class Condicional_04 {
    public static void main(String[] args) {
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Dame un numero");
        n=leer.nextInt();
        if (n>=0){
            if(n==0){
                System.out.println("El numero es 0 ");
             }
            else{
                System.out.println("El numero " + n + " es Positivo");
            }
        }
        else{
           System.out.println("El numero " + n + " es Negatrivo");
        }
    }
}