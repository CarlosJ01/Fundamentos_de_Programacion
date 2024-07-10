package condicional_03;
import java.util.Scanner;
public class Condicional_03 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,c,r=0;
        System.out.print("Dame un numero: ");
        n=leer.nextInt();
        System.out.println("");
        System.out.println("A que qieres elevar el numero");
        System.out.printf("\tCodigo\t Potencia \n");
        System.out.printf("\t1\t Al Cuadrado \n");
        System.out.printf("\t2\t Al Cubo \n");
        System.out.printf("\t3\t A la Cuarta Potencia \n");
        System.out.println("");
        System.out.print("Ingresa el codigo: ");
        c=leer.nextInt();
        switch(c){
            case 1: r=(n*n);
                    break;
            case 2: r=n*n*n;
                    break;
            case 3: r=(n*n*n*n);
                    break;
            default: System.out.println("Codigo Invalido");
            break;
        }
        System.out.println("El resultado es: "+ r);
    }
}