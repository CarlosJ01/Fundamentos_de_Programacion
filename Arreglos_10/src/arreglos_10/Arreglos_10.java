package arreglos_10;
import java.util.Scanner;
import java.util.Random;
public class Arreglos_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random Ram = new Random();
        String mat[][]=new String[Ram.nextInt(6)+4][Ram.nextInt(6)+4];
        String neoCad;
        int fil,col;
        for (fil=0;fil<mat.length;fil++) {
            System.out.println("\nDame las cadenas de la fila "+(fil+1));
            for (col=0;col<mat[fil].length;col++) {
                System.out.print("Dame una cadena "+(col+1)+" : ");
                mat[fil][col]=leer.nextLine();
            }
        }
        for (fil=mat.length-1,neoCad="";fil>=0;fil--)
            for (col=mat[fil].length-1;col>=0;col--)
                neoCad+=mat[fil][col].substring(0,3);
        System.out.println("\n\nMatriz de Cadenas");
        for (fil=0;fil<mat.length;fil++) {
            for (col=0;col<mat[fil].length;col++)
                System.out.print(mat[fil][col]+"\t");
            System.out.println("");
        }
        System.out.println("\nLa cadena formada por las cadenas de la matriz es: "+neoCad);
    }
}