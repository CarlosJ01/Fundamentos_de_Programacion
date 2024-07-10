package ciclos_01;
import java.util.Scanner;
public class Ciclos_01 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int N,v,i=1,s;
        System.out.print("Dame el valor inicial: ");
        v=leer.nextInt();
        System.out.print("Dame el numero de terminos: ");
        N=leer.nextInt();
        System.out.print(v);
        s=v;
        while (i<N){
            v++;
            System.out.print(" + "+ v);
            s=s+v;
            i++;
        }
        System.out.print(" = "+s+"\n");
    }    
}