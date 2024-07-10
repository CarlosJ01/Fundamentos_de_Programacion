package cadenas_15;
import java.util.Scanner;
public class Cadenas_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad,res,nCad,pal;
        int i;
        boolean ind;
        do {
            nCad="";
            System.out.print("Ingresa una cadena: ");
            cad=leer.nextLine();
            for (i=0,pal="",ind=true;ind==true;i++) {
                if (cad.charAt(i)!=' ') 
                    pal+=cad.charAt(i);
                if (cad.charAt(i)==' ' || i==cad.length()-1)
                    ind=false;
            }
            nCad+=pal+" ";
            for (i=cad.length()-1,ind=true,pal="";ind==true;i--) {
                if (cad.charAt(i)!=' ') 
                    pal+=cad.charAt(i);
                if (cad.charAt(i)==' ' || i==0){
                    StringBuilder inver = new StringBuilder(pal);
                    pal=inver.reverse().toString();
                    ind=false;   
                }
            }
            nCad+=pal;
            System.out.print("La cadena formada es: "+nCad);
            System.out.print(", ¿Desea continuar?: ");
            res=leer.nextLine();
            System.out.println("");
        } while (res.equalsIgnoreCase("SI"));
    }
}