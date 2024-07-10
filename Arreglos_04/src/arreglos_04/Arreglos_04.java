package arreglos_04;
import java.util.Scanner;
public class Arreglos_04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mat[][];
        int fil,col,cont,cel;
        boolean arr,aba,izq,der,ind;
        System.out.print("Cuantas filas: ");
        fil=leer.nextInt();
        System.out.print("Cuantas columnas: ");
        col=leer.nextInt();
        mat=new int [fil][col];
        cel=fil*col;
        cont=1;
        fil=0;
        col=0;
        arr=false;
        aba=true;
        izq=false;
        der=false;
        while (cont<=cel) {
            if (arr==true && cont<=cel) {
                mat[fil][col]=cont;
                fil--;
                cont++;
                if (fil<0 || mat[fil][col]!=0) {
                    izq=true;
                    arr=false;
                    fil++;
                    col--;
                }
            }
            if (aba==true && cont<=cel) {
                mat[fil][col]=cont;
                fil++;
                cont++;
                if (fil>=mat.length || mat[fil][col]!=0) {
                    der=true;
                    aba=false;
                    fil--;
                    col++;
                }
            }
            if (izq==true && cont<=cel) {
                mat[fil][col]=cont;
                col--;
                cont++;
                if (col<0 || mat[fil][col]!=0) {
                    aba=true;
                    izq=false;
                    fil++;
                    col++;
                }
            }
            if (der==true && cont<=cel) {
                mat[fil][col]=cont;
                col++;
                cont++;
                if (col>=mat[fil].length || mat[fil][col]!=0) {
                    arr=true;
                    der=false;
                    col--;
                    fil--;
                }
            }
        }
        System.out.println("");
        for (fil=0;fil<mat.length;fil++) {
            for (col=0;col<mat[fil].length;col++)
                System.out.printf("%2d\t",mat[fil][col]);
            System.out.println("");
        }
    }
}