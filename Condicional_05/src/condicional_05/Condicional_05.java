package condicional_05;
import java.util.Scanner;
public class Condicional_05 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int aa,ac,r;
        System.out.print("Dame el año actual: ");
        aa=leer.nextInt();
        System.out.print("Dame un año cualquiera: ");
        ac=leer.nextInt();
        if(ac>=aa){
            r=ac-aa;
            System.out.println("Los años que faltan para el año " + ac + " son: " + r);
        }
        else{
            r=aa-ac;
            System.out.println("Los años que pasaron desde el año " + ac + " son: " + r);
        }
    }
}