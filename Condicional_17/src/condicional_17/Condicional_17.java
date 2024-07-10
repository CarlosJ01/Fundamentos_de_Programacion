package condicional_17;
import java.util.Scanner;
public class Condicional_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia;
        String diaE;
        System.out.print("Dame un numero: ");
        dia=leer.nextInt();
        switch (dia) {
            case 1: diaE="Domingo";
                break;
            case 2: diaE="Lunes";
                break;
            case 3: diaE="Martes";
                break;
            case 4: diaE="Miercoles";
                break;
            case 5: diaE="Jueves";
                break;
            case 6: diaE="Viernes";
                break;
            case 7: diaE="Sabado";
                break;
            default:    diaE="Error";
                break;
        }
        System.out.println("Dia: "+diaE);
    }
}