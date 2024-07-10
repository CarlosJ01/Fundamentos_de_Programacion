package condicional_14;
import java.util.Scanner;
public class Condicional_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cal[] = new String[3];
        int cre[] = new int[3];
        int calNum[] = new int[3];
        int i=0;
        float prom=0;
        System.out.print("Dame la calificacion de 1: ");
        cal[0]=leer.nextLine();
        System.out.print("Dame los creditos de 1: ");
        cre[0]=leer.nextInt();
        System.out.print("\nDame la calificacion de 2: ");
        leer.nextLine();
        cal[1]=leer.nextLine();
        System.out.print("Dame los creditos de 2: ");
        cre[1]=leer.nextInt();
        System.out.print("\nDame la calificacion de 3: ");
        leer.nextLine();
        cal[2]=leer.nextLine();
        System.out.print("Dame los creditos de 3: ");
        cre[2]=leer.nextInt();
        while (i<3) {
            switch (cal[i]) {
                case "A":
                    cal[i]="4";
                    break;
                case "B":
                    cal[i]="3";
                    break;
                case "C":
                    cal[i]="2";
                    break;
            }
            i++;
        }
        for (i=0;i<3;i++) {
            prom=prom + (Float.parseFloat(cal[i])*cre[i]);
        }
        System.out.println("\nTu promedio es de: "+prom/3);
    }  
}