package arreglos_01;
import java.util.Scanner;
public class Arreglos_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char mat[][];
        int fil,col,n;
        System.out.print("Dame un numero de renglones: ");
        n=leer.nextInt();
        if (n%2!=0)
            mat=new char [n][];
        else
            mat=new char[9][];
        System.out.println("");
        for (fil=0,n=1;fil<mat.length/2+1;fil++,n++) {
            mat[fil]=new char[n];
            for (col=0;col<mat[fil].length;col++) {
                mat[fil][col]='*';
                System.out.print(mat[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (n=n-2;fil<mat.length;fil++,n--) {
            mat[fil]=new char[n];
            for (col=0;col<mat[fil].length;col++) {
                mat[fil][col]='*';
                System.out.print(mat[fil][col]+"\t");
            }
            System.out.println("");
        }
    }
}