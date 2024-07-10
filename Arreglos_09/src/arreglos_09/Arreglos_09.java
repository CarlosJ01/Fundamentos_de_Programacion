package arreglos_09;
import java.util.Scanner;
import java.util.Random;
public class Arreglos_09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random ram = new Random();
        int fil,col,sal,i;
        char cars[][]=new char[5][7];
        System.out.println("\t\tTABLA DE CARACTERES");
        for (fil=0;fil<cars.length;fil++) {
            for (col=0;col<cars[fil].length;col++) {
                cars[fil][col]=(char)(ram.nextInt(26)+65);
                System.out.print(cars[fil][col]+"\t");
            }
            System.out.println("");
        }
        System.out.println("____________________________________________________");
        System.out.print("Cuantos saltos quires dar entre celdas: ");
        sal=leer.nextInt();
        System.out.println("____________________________________________________");
        System.out.println("Los caracteres por los que paso fueron: ");
        System.out.print(cars[0][0]);
        for (i=1,fil=-1,col=1;i<=sal;i++,col++,fil--) {
            if (fil<0)
                fil=cars.length-1;
            if (fil>=cars.length)
                fil=0;
            if (col<0)
                col=cars[0].length;
            if (col>=cars[0].length)
                col=0;
            System.out.print(" , "+cars[fil][col]);
        }
        System.out.println("");
    }
}