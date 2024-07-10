package arreglos_05;
import java.util.Random;
public class Arreglos_05 {
    public static void main(String[] args) {
        Random Ram = new Random();
        int vec[];
        char mat[][];
        int n,i,col,ren;
        String num;
        n=Ram.nextInt(10)+1;
        vec = new int [n];
        mat = new char [n][];
        for (i=0;i<vec.length;i++) {
            vec[i]=Ram.nextInt(900001);
        }
        for (ren=0,i=0;ren<mat.length;ren++,i++) {
            mat[ren]=new char[Integer.toBinaryString(vec[i]).length()];
            num=Integer.toBinaryString(vec[i]);
            for (col=0,n=0;col<mat[ren].length;col++,n++) 
                mat[ren][col]=num.charAt(n);
        }
        System.out.println("Vector\t\tMatriz");
        System.out.println("");
        for (ren=0,i=0;ren<mat.length;ren++,i++) {
            System.out.print(vec[i]+"\t");
            for (col=0;col<mat[ren].length;col++)
                System.out.print(mat[ren][col]);
            System.out.println("");
        }
    }
}