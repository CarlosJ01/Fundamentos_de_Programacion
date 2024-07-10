package cadenas_18;
import java.util.Scanner;
public class Cadenas_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad;
        int nc,i,pd=0;
        char car;
        float num;
        boolean ind1=true,ind2=true;
        System.out.print("Dame una cadena: ");
        cad=leer.nextLine();
        nc=cad.length();
        for (i=0;i<nc && ind1==true;i++){
            car=cad.charAt(i);
            switch (car){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                case '.': ind2=false;
                          pd++;
                    break;
                default:ind1=false;
                    break;
            }
        }
        if(ind1==true && ind2==false && pd==1){
            num=(Float.parseFloat(cad))*100;
            System.out.println("La cadena "+cad+" convertida a flotante y multiplicada por 100 es: "+num);
        }
        else{
            System.out.println("ERROR: LA CADENA NO TIENE FORMATO DE NUMERO FLOTANTE POR LETRAS,CARACTERES,ESPACIOS,...ETC");
        }
    }  }
