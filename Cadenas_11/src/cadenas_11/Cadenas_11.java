package cadenas_11;
import java.util.Scanner;
public class Cadenas_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad1,cad2;
        int i;
        boolean ind;
        do {
            System.out.print("Dame una cadena: ");
            cad1=leer.nextLine();
            System.out.print("Dame otra cadena: ");
            cad2=leer.nextLine();
            for (i=0,ind=true;i<cad1.length() && ind==true;i++) {
                if ((cad1.toUpperCase().charAt(i))!=(cad2.toUpperCase().charAt(i)))
                    ind=false;
            }
            if (ind==true)
                System.out.println("Las cadenas son Iguales");
            else
                System.out.println("Las cadenas son Diferentes");
            System.out.println("");
        } while (cad1.length()>=5 && cad2.length()>=5);
    }
}