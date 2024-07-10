package condicional_12;
import java.util.Scanner;
public class Condicional_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int km;
        float mon=0;
        System.out.print("Dame el numero de km que recorrio: ");
        km=leer.nextInt();
        if (km<=300)
            mon=300;
        else {
            if (km>300 && km<=1000)
                mon=300+((km-300)*15);
            if (km>1000) 
                mon=300+(float)((km-300)*14.50);
        }
        System.out.println("Su monto a pagar es: "+mon+"$");
    }
}