package condicional_11;
import java.util.Scanner;
public class Condicional_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String n,ni;
        System.out.print("Dame un numero de 3 cifras: ");
        n=leer.nextLine();
        StringBuilder invertido = new StringBuilder(n);
        ni=invertido.reverse().toString();
        if (n.equalsIgnoreCase(ni))
            System.out.println("El numero es palindromo");
        else
            System.out.println("El numero no es palindromo");
    }
}