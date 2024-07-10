package condicional_16;
import java.io.IOException;
import java.util.Scanner;
public class Condicional_16 {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        char gru,resp;
        int hrs,edad,pru;
        float suel;
        System.out.println("Grupo A:Base \t Grupo B:Interinos");
        System.out.print("Dame tu grupo de empleados: ");
        gru=(char)System.in.read();
        System.in.read();
        System.out.println("----------------------------------------------------");
        switch (gru) {
            case 'A':   System.out.print("Dame tu sueldo: ");
                        suel=leer.nextFloat();
                        System.out.print("De cuantas hrs es tu plaza: ");
                        hrs=leer.nextInt();
                        System.out.print("Es mujer o mayor de 65 años(S/N): ");
                        resp=(char)System.in.read();
                        System.out.print("Cuantos años tiene en la empresa: ");
                        edad=leer.nextInt();
                        if (hrs==40) {
                            suel+=50.00;
                            if (resp=='S' && edad>=30)
                                suel+=800.00;
                        }
                        System.out.println("----------------------------------------------------");
                        System.out.println("Tu sueldo final es: "+suel+"$");
                break;
            case 'B':   System.out.print("Cuantos años tienes: ");
                        edad=leer.nextInt();
                        System.out.print("Cuantos puntos tienes en la prueva: ");
                        pru=leer.nextInt();
                        System.out.println("----------------------------------------------------");
                        if (edad>=20 && pru>=85)
                            System.out.println("Sera contratado");
                        else
                            System.out.println("No sera contratado");
                break;
        }
    }
}