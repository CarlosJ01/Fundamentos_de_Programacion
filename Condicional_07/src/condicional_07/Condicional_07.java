package condicional_07;
import java.util.Scanner;
public class Condicional_07 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1,n2;
        System.out.print("Dame un numero: ");
        n1=leer.nextInt();
        System.out.print("Dame otro numero: ");
        n2=leer.nextInt();
        System.out.println("");
        if(n1>n2)
            System.out.println("El numnero "+n1+" Es el Mayor.");
        else{
            if(n2>n1){
                System.out.println("El numnero "+n2+" Es el Mayor.");
            }
            else
                System.out.println("Los Dos numeros son iguales.");
        }
    }
}