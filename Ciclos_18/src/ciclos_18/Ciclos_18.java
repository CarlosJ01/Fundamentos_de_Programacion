package ciclos_18;
import java.util.Scanner;
public class Ciclos_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nc,i=0,v=0;
        String cad;
        char car;
        System.out.print("Dame una cadena (sin acentos): ");
        cad=leer.nextLine();
        nc=cad.length();
        while(i<nc){
            car=cad.charAt(i);
            if (car=='á'){ //|| car=='é'|| car=='í'|| car=='ó'|| car=='ú'|| car=='Á'|| car=='É'|| car=='Í'|| car=='Ó'|| car=='Ú'){
                v++;
            }
            switch(car){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': v++;
                    break;
            }
            i++;
        }
        System.out.println("La cadena dada tiene "+ v +" Vocales");
    } 
}