package cadenas_16_ver2;
import java.util.Scanner;
import java.util.Random;
public class Cadenas_16_Ver2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random r=new Random();
        int n,i,contPal;
        String frace,nueva,res,palEli;
        do{
            palEli="";
            contPal=1;
            nueva="";
            System.out.print("Ingrese una cadena: ");
            frace=leer.nextLine();
            n=r.nextInt(4)+1; // generar un numero aleatorio de 0 al 3
            System.out.println("numero aleatorio vale " + n);
            for (i=0;i<frace.length();i++) {
                    if (frace.charAt(i)==' ')
                        contPal++;
                    if (contPal!=n)
                        nueva+=frace.charAt(i);
                    else
                        palEli+=frace.charAt(i);
            }
            System.out.println("La palabra eliminada es: "+palEli);
            System.out.println("La nueva cadena nueva es: " + nueva);
            System.out.println("¿Desea otra frase?: ");
            res=leer.nextLine();
            System.out.println("");
        }while (res.equalsIgnoreCase("Si"));
    } 
}