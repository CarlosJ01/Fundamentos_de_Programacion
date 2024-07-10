package arreglos_07;
import java.util.Random;
public class Arreglos_07 {
    public static void main(String[] args) {
        Random ale=new Random();
        int mat[][]=new int[3][5];
        int fil,col,n,i,j;
        boolean ind;
        for (fil=0;fil<mat.length;fil++) {
            for (col=0;col<mat[fil].length;col++) {
                do {
                    n=ale.nextInt(17)+20;
                    for (i=0,ind=true;i<mat.length && ind==true;i++) {
                        for (j=0;j< mat[i].length && ind==true;j++) {
                            if (n==mat[i][j])
                                ind=false;
                        }
                    }
                } while (ind==false);
                mat[fil][col]=n;
            }
        }
        for (fil=0;fil<mat.length;fil++) {
            for (col=0;col<mat[fil].length;col++) {
                System.out.printf("%2d\t",mat[fil][col]);
            }
            System.out.println("");
        }
    }
}