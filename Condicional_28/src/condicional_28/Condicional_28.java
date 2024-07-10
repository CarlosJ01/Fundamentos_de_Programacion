package condicional_28;
import java.util.Scanner;
public class Condicional_28 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nom[]=new String[2];
        float com[]=new float[2];
        int ven[]=new int[2];
        System.out.print("Nombre del 1° vendedor: ");
        nom[0]=leer.nextLine();
        System.out.print("Ventas del 1° vendedor: ");
        ven[0]=leer.nextInt();
        System.out.print("\nNombre del 2° vendedor: ");
        leer.nextLine();
        nom[1]=leer.nextLine();
        System.out.print("Ventas del 2° vendedor: ");
        ven[1]=leer.nextInt();
        System.out.println("____________________________________________________");
        if (ven[0]<500)
            com[0]=(float)(ven[0]*0.05);
        else
            if (ven[0]<1000)
                com[0]=(float)(ven[0]*0.01);
            else
                if (ven[0]<1500)
                    com[0]=(float)(ven[0]*0.02);
                else
                    com[0]=(float)(ven[0]*0.025);
        if (ven[1]<500)
            com[1]=(float)(ven[1]*0.05);
        else
            if (ven[1]<1000)
                com[1]=(float)(ven[1]*0.01);
            else
                if (ven[1]<1500)
                    com[1]=(float)(ven[1]*0.02);
                else
                    com[1]=(float)(ven[1]*0.025);
        System.out.println("La comicion de "+nom[0]+" es: "+com[0]+"$");
        System.out.println("La comicion de "+nom[1]+" es: "+com[1]+"$");
        if (ven[0]==ven[1])
            System.out.println("Los dos Vendedores tienen ventas iguales");
        else {
            if (ven[0]>ven[1])
                System.out.println("El vendedor con mas ventas es: "+nom[0]);
            if (ven[0]<ven[1])
                System.out.println("El vendedor con mas ventas es: "+nom[1]);
        }
        
    }
}