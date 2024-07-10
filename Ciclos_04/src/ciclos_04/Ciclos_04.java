package ciclos_04;
import java.util.Scanner;
public class Ciclos_04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N,n,i,may=0,men=0,s=0;
        float p;
        System.out.print("Cuantos numeros son: ");
        N=leer.nextInt();
        System.out.println("");
        for(i=1;i<=N;i++){
            System.out.print("Dame el "+i+"° numero: ");
            n=leer.nextInt();
            if(n!=0){
                if(n>=may)
                    may=n;
                if(i==1){
                    men=may;
                }
                if(n<=men)
                    men=n;
                s=s+n;
            }
            System.out.println("");
        }
        if(N<=0){
            p=0;
        }
        else{
            p=(float)s/N;   
        }
        System.out.println("El numero mayor es: "+ may);
        System.out.println("El numero menor es: "+ men);
        System.out.println("El promedio de los numeros es: "+ p);
    }
}