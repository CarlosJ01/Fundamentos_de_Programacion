package condicional_22;
import java.util.Scanner;
public class Condicional_22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float pag=0;
        int i;
        String tie,hrs,min,dia;
        System.out.print("Cuantos permanecio en el estacionamiento(hh:mm): ");
        tie=leer.nextLine();
        System.out.print("Que dia es: ");
        dia=leer.nextLine();
        System.out.println("\n----------------------------------------------------\n");
        for (i=0,hrs="";i<tie.length() && tie.charAt(i)!=':';i++)
            hrs=hrs+tie.charAt(i);
        for (i++,min="";i<tie.length();i++)
            min=min+tie.charAt(i);
        if (Integer.parseInt(hrs)<=0 && Integer.parseInt(min)<=10) 
            System.out.println("No tendra que Pagar");
        else {
            pag+=(Float.parseFloat(hrs)*6.00);
            if (Integer.parseInt(min)<=30)
                pag+=4.50;
            else
                pag+=6.00;
            if (dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Sabado"))
                pag-=(pag*0.1256);
            System.out.printf("Su pago es de: %,3.2f $\n",pag);
        }
    }
}