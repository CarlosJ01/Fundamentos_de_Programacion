package arreglos_12;
import java.util.Random;
import java.util.Scanner;
public class Arreglos_12 {
    public static void main(String[] args) {
        Random Ram = new Random();
        Scanner leer = new Scanner(System.in);
        int arr[]=new int [Ram.nextInt(21)+5];
        int i,j,k,med,n;
        boolean ind;
        for (i=0;i<arr.length;i++) {
            System.out.print("Dame el numero "+(i+1)+" : ");
            n=leer.nextInt();
            if (i>0) {
                if (n<=arr[i-1]) {
                    for (j=0,ind=true;j<i && ind==true;j++) {
                        if (n<=arr[j]) {
                            for (k=arr.length-1;k>j;k--)
                                arr[k]=arr[k-1];
                            arr[j]=n;
                            ind=false;
                        }
                    }
                }
                else
                    arr[i]=n;
            }
            else
                arr[0]=n;
        }
        System.out.println("\nArreglo Ordenado");
        for (i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        if (arr.length%2==0)
            med=(arr[arr.length/2]+arr[arr.length/2-1])/2;
        else
            med=arr[arr.length/2];
        System.out.println("\nLa media de los valores es: "+med);
    }
}