package condicional_27;
import java.util.Scanner;
public class Condicional_27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float tot,desA,desB,desC;
        int madA,madB,madC;
        System.out.print("Cuantos metros cubicos de madera A fueron comprados: ");
        madA=leer.nextInt();
        System.out.print("Cuantos metros cubicos de madera B fueron comprados: ");
        madB=leer.nextInt();
        System.out.print("Cuantos metros cubicos de madera C fueron comprados: ");
        madC=leer.nextInt();
        System.out.println("____________________________________________________");
        tot=madA+madB+madC;
        if (tot>=30 && madA!=0 && madB!=0 && madC!=0) {
            desA=(float)((madA*10)*0.96);
            desB=(float)((madB*10)*0.92);
            desC=(float)((madC*10)*0.90);
            tot=desA+desB+desC;
            System.out.printf("El total a pagar con descuento es: %4.2f $\n",tot);
        }
        else{
            tot=(madA+madB+madC)*10;
            System.out.printf("El total a pagar es: %4.2f $\n",tot);
        }       
    }
}