package cadenas_07;
import java.util.Scanner;
public class Cadenas_07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad,cadExt;
        int valIni,valFin,lonCad,may,men;
        char car;
        do{
            cadExt="";
            System.out.print("Dame una cadena: ");
            cad=leer.nextLine();
            lonCad=(cad.length())-1;
            System.out.print("Dame Indice Inicial: ");
            valIni=leer.nextInt();
            System.out.print("Dame Indice Final: ");
            valFin=leer.nextInt();
            may=Math.max(valIni,valFin);
            men=Math.min(valIni,valFin);
            if(men<0 || may>lonCad){
                System.out.println("ERROR: ALGUNO DE LOS INDICES ESTAN FUERA DE RANGO");
                cadExt="No existe";
            }
            else{
                while(men<=may){
                    car=cad.charAt(men);
                    if ((int)car==65533){
                        cadExt=cadExt.concat(String.valueOf("ñ"));
                    }
                    else{
                        cadExt=cadExt.concat(String.valueOf(car));
                    }
                    men++;
                }
            }
            System.out.print("La subcadena extraida es: " + cadExt + "\n\n");
            leer.nextLine();
        }while((cadExt.length())>=4);
    }
}