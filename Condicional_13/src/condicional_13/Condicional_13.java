package condicional_13;
import java.util.Scanner;
public class Condicional_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sue;
        float salNet,inp;
        System.out.print("Dame tu sueldo: ");
        sue=leer.nextInt();
        if (sue<=2000) {
            inp=0;
            salNet=sue;
        }
        else {
            if (sue>2000 && sue<=5000) {
                inp=(float)((sue-2000)*0.02);
                salNet=sue-inp;
            }
            else {
                inp=(float)(500+((sue-5000)*0.05));
                salNet=sue-inp;
            }
        }
        System.out.println("");
        System.out.print("Sueldo sin inpuestos: "+sue+"$\n");
        System.out.print("Inpuestos a pagar: "+inp+"$\n");
        System.out.print("Sueldo con inpuestos descontados: "+salNet+"$\n");
    }
}