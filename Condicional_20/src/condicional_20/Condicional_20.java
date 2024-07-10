package condicional_20;
import java.util.Scanner;
public class Condicional_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float com,tot;
        String bol;
        System.out.print("Cual es el importe total de la compra: ");
        com=leer.nextFloat();
        System.out.print("De que color es la bolita : ");
        leer.nextLine();
        bol=leer.nextLine();
        System.out.println("----------------------------------------------------");
        switch (bol.toUpperCase().charAt(0)) {
            case 'A':   tot=(float) (com-(com*0.2));
                break;
            case 'R':   tot=(float) (com-(com*0.3));
                break;
            case 'B':   tot=com;
                break;
            default:    System.out.println("ERROR");
                        tot=0;
        }
        if (tot!=0)
            System.out.println("El cliente debe de pagar: "+tot+" $");
    }
}