package cadenas_17;
import java.util.Random;
import java.util.Scanner;
public class Cadenas_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random ale = new Random(); 
        String cad,nCad;
        int cont,x;
        System.out.print("Ingresa una Cadena: ");
        cad=leer.nextLine();
        for (cont=1,nCad="";cont<=3;cont++) {
            x=ale.nextInt(cad.length());
            System.out.println(x);
            if (x==cad.length()-1)
                nCad+=cad.substring(x-2,x);
            else 
                nCad+=cad.substring(x,x+2);
        }
        System.out.println("La nueva cadena es: "+nCad);
    }
}