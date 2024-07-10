package condicional_23;
import java.util.Scanner;
public class Condicional_23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float imp;
        int km,ton;
        String veh;
        System.out.print("Que vehiculo circula: ");
        veh=leer.nextLine();
        System.out.print("Cuantos Km's son: ");
        km=leer.nextInt();
        switch (veh.toUpperCase()) {
            case "BICICLETA":   
                    imp=(float)(km*1.5);
                break;
            case "MOTO":
            case "CARRO":
                    imp=(float)(km*3.5);
                break;
            case "CAMION":
                    System.out.print("Cuantas Toneladas lleva: ");
                    ton=leer.nextInt();
                    imp=(float)((km*35)+(ton*10));
                break;
            default:
                System.out.println("----------------------------------------------------");
                System.out.println("Error vehiculo rechazado");
                imp=0;
        }
        if (imp!=0) {
            System.out.println("----------------------------------------------------");
            System.out.printf("Su pago es de: %4.2f $\n",imp);
        }
    }
}