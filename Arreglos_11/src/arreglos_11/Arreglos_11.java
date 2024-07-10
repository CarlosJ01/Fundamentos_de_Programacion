package arreglos_11;
import java.util.Random;
public class Arreglos_11 {
    public static void main(String[] args) {
        Random Ram = new Random();
        int A[][]= new int [3][8];
        int B[][]= new int [2][10];
        int fil,col,rep,colB;
        for (fil=0;fil<A.length;fil++)
            for (col=0;col<A[fil].length;col++)
                A[fil][col]=Ram.nextInt(10)+1;
        for (colB=0;colB<B[0].length;colB++)
            B[0][colB]=Ram.nextInt(10)+1;
        for (colB=0;colB<B[1].length;colB++) {
            for (fil=0,rep=0;fil<A.length;fil++)
                for (col=0;col<A[fil].length;col++)
                    if (B[0][colB]==A[fil][col])
                        rep++;
            B[1][colB]=rep;
        }
        System.out.println("\t\t\tMatriz Formada");
        for (fil=0;fil<A.length;fil++) {
            for (col=0;col<A[fil].length;col++)
                System.out.print(A[fil][col]+"\t");
            System.out.println("");
        }
        System.out.println("");
        for (col=0;col<B[0].length;col++)
            System.out.println("El valor "+B[0][col]+" aparece "+B[1][col]+" Veces");
    }
}