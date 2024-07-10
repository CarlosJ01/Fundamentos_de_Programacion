package arreglos_03;
import java.util.Scanner;
public class Arreglos_03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arr[]=new int [10];
        int i=0,n,imax=0,j,k;
        boolean ind;
        do {
            System.out.print("Ingresa valores: ");
            n=leer.nextInt();
            if (n!=0) {
                if (i>0) {
                    if (n>arr[imax]) {
                        arr[imax+1]=n;
                        imax++;
                        i++;
                    }
                }
                else {
                    arr[0]=n;
                    i++;
                }
            }
        } while (i<10 && n!=0);
        System.out.println("");
        if (i<10) {
            do {
                System.out.print("Dame nuevos Valores: ");
                n=leer.nextInt();
                for (j=0,ind=true;j<arr.length && ind==true;j++) {
                    if (n<arr[j]) {
                        for (k=arr.length-1;k>j;k--) {
                            arr[k]=arr[k-1];
                        }
                        arr[j]=n;
                        ind=false;
                    }
                }
                if (ind==true)
                    arr[i]=n;
                i++;
            } while (i<10);
        }
        System.out.println("\nArreglo Llenado");
        for (i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
}