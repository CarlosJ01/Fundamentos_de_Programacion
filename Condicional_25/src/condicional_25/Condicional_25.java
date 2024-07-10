package condicional_25;
import java.util.Scanner;
import java.io.IOException;
public class Condicional_25 {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        char cla;
        int hrs;
        float suel;
        System.out.print("Dame tus horas trabajadas semanalmente: ");
        hrs=leer.nextInt();
        System.out.print("Dame tu clase de trabajador: ");
        cla=(char)System.in.read();
        System.out.println("____________________________________________________");
        if (hrs<=48) {
            switch (cla) {
                case 'a':
                case 'A':
                        suel=(float)hrs*7;
                    break;
                case 'b':
                case 'B':
                        suel=(float)hrs*5;
                    break;
                case 'c':
                case 'C':
                        suel=(float)hrs*4;
                    break;
                case 'd':
                case 'D':
                        suel=(float)(hrs*3.5);
                    break;
                default:
                    System.out.println("Error: <Clase> No disponible");
                    suel=0;
            }
            System.out.printf("Su sueldo semanal es: %4.2f $\n",suel);
        }
        else
            System.out.println("No se permite trabajar mas de 48 hrs semales");
    }
}