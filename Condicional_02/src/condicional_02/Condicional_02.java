package condicional_02;
import java.util.Scanner;
public class Condicional_02 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String fig;
        int b,h;
        double at,ac,r;
        final double PI=Math.PI;
        char f;
        System.out.println("Dame con que figura quieres trabajar (Triangulo/Circulo)");
        fig=leer.nextLine();
        f=fig.charAt(0);
        if(f=='T'){
            System.out.println("Dame la base y altura");
            b=leer.nextInt();
            h=leer.nextInt();
            if(b<0||h<0){
                System.out.println("Error ingresaste valores negativos");
            }
            else{
                at=(float)(b*h)/2;
                System.out.println("La area del Triangulo es: " + at);
            }
        }
        else{
            System.out.println("Dame el radio");
            r=leer.nextFloat();
            if(r<0){
                System.out.println("Error ingresaste valores negativos");
            }
            else{
                ac=(PI*(Math.pow(r,2.0)));
                System.out.printf("La area del Circulo es: %3.4f\n",ac);
            }
        }
    }
}