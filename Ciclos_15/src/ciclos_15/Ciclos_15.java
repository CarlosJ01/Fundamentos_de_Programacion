package ciclos_15;
import java.util.Scanner;
public class Ciclos_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String numOri,numInv="";
        int nd,i;
        char dig;
        System.out.print("Dame un numero entero: ");
        numOri=leer.nextLine();
        nd=numOri.length();
        System.out.println("");
        for(i=(nd-1);i>=0;i--){
            dig=numOri.charAt(i);
            numInv=numInv+String.valueOf(dig);
        }
        System.out.print("El Valor Original es: " + numOri + "\n");
        System.out.print("El Valor Inverso es: " + numInv + "\n");
    }  
}