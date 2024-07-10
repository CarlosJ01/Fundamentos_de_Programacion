package arreglos_06;
import java.util.Scanner;
import java.util.Random;
public class Arreglos_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random Ram = new Random();
        int vec[],mat[][];
        int N,i,ren,col,numCol;
        do {
            System.out.print("Dame el numero de renglones: ");
            N=leer.nextInt();
        } while (N<5 || N>20);
        vec=new int [N];
        mat=new int [N][];
        for (i=0;i<vec.length;i++)
            vec[i]=Ram.nextInt(100)+1;
        for (ren=0;ren<mat.length;ren++) {
            N=vec[ren];
            i=1;
            do {
                if (N%2==0)
                    N=N/2;
                else
                    N=(N*3)+1;
                i++;
            } while (N>1);
            mat[ren]=new int [i];
            col=0;
            mat[ren][col]=vec[ren];
            do {
                if (mat[ren][col]%2==0)
                    mat[ren][col+1]=mat[ren][col]/2;
                else
                    mat[ren][col+1]=(mat[ren][col]*3)+1;
                col++;
            } while (mat[ren][col]>1);
        }
        System.out.println("\nVector\t\tMatriz Ulam");
        for (ren=0;ren<mat.length;ren++) {
            System.out.print(vec[ren]+"\t\t");
            for (col=0;col<mat[ren].length;col++)
                System.out.print(mat[ren][col]+"\t");
            System.out.println("");
        }
    }
}