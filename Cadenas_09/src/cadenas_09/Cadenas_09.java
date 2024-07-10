package cadenas_09;
import java.util.Scanner;
public class Cadenas_09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad1,cad2,cadN="";
        int nc1,nc2,i;
        char car;
        System.out.print("Dame la 1° Cadena: ");
        cad1=leer.nextLine();
        System.out.print("Dame la 2° Cadena: ");
        cad2=leer.nextLine();
        nc1=cad1.length();
        nc2=nc1/2;
        if(nc1%2 == 0){
            for (i=0;i<nc2;i++){
                car=cad1.charAt(i);
                cadN=cadN.concat(String.valueOf(car));
            }
        }
        else{
            for (i=0;i<=nc2;i++){
                car=cad1.charAt(i);
                cadN=cadN.concat(String.valueOf(car));
            }
        }
        cadN=cadN.concat(cad2);
            for (;i<nc1;i++){
                car=cad1.charAt(i);
                cadN=cadN.concat(String.valueOf(car));
            }
        System.out.print("La cadena nueva es: " + cadN + "\n");
    }
}