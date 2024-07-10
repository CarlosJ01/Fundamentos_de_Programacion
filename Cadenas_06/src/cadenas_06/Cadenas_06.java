package cadenas_06;
import java.util.Scanner;
public class Cadenas_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad,nCad,pal;
        int i;
        do {
            System.out.print("Dame una cadena: ");
            cad=leer.nextLine();
            if (!(cad.equalsIgnoreCase("Fin"))) {
                for (i=0,pal="",nCad="";i<cad.length();i++) {
                    if (cad.charAt(i)!=' ')
                        pal+=cad.charAt(i);
                    if ((cad.charAt(i)==' ' && !(pal.equalsIgnoreCase(""))) || i==cad.length()-1){
                        nCad+=String.valueOf(pal.charAt(0)).toUpperCase() + pal.substring(1,pal.length()).toLowerCase() + " ";
                        pal="";
                    }
                }
                System.out.print("Cadena ingresada: " + nCad + "\n");
            }
            System.out.println("");
        } while(!(cad.equalsIgnoreCase("Fin")));
    }
}