package arreglos_08;
import java.util.Scanner;
public class Arreglos_08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int mat[][]={{74,42,11,39,9,84,58,8},{76,49,41,96,20,65,2,71},{80,30,99,66,91,5,46,75}};
        int renGuar[]=new int [8];
        int n,m,ren,col,i;
        System.out.println("Matriz Original");
        for (ren=0;ren<mat.length;ren++) {
            for (col=0;col<mat[ren].length;col++)
                System.out.printf("%2d\t",mat[ren][col]);
            System.out.println("");
        }
        System.out.println("");
        do {
            System.out.print("Dame un numero de renglon: ");
            n=leer.nextInt();
        } while (n<0 || n>=3);
        do {
            System.out.print("Dame un otro numero de renglon: ");
            m=leer.nextInt();
        } while (m<0 || m>=3);
        for (col=0;col<mat[n].length;col++)
            renGuar[col]=mat[n][col];
        for (col=0;col<mat[m].length;col++)
            mat[n][col]=mat[m][col];
        for (col=0;col<mat[m].length;col++)
            mat[m][col]=renGuar[col];
        System.out.println("\nNueva Matriz cambiando el renglon "+n+" por el "+m+" y viseversa");
        for (ren=0;ren<mat.length;ren++) {
            for (col=0;col<mat[ren].length;col++)
                System.out.printf("%2d\t",mat[ren][col]);
            System.out.println("");
        }
    }   
}