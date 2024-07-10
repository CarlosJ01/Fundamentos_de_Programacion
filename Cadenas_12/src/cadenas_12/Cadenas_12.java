package cadenas_12;
import java.util.Scanner;
public class Cadenas_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad;
        int nc,i,cv,cc,cd;
        char car;
        do{
            System.out.print("Ingrese una cadena: ");
            cad=leer.nextLine();
            cad=cad.toUpperCase();
            nc=cad.length();
            for (i=0,cv=0,cc=0,cd=0;i<nc;i++) {
                car=cad.charAt(i);
                if((int)car==65533){
                    car='N';
                }
                switch(car){
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':   cv++;
                        break;
                    case'B':
                    case'C':
                    case'D':
                    case'F':
                    case'G':
                    case'H':
                    case'J':
                    case'K':
                    case'L':
                    case'M':
                    case'N':
                    case'P':
                    case'Q':
                    case'R':
                    case'S':
                    case'T':
                    case'V':
                    case'W':
                    case'X':
                    case'Y':
                    case'Z':    cc++;
                        break;
                    case ' ':
                        break;
                    default:    cd++;
                        break;
                }
            }
            if(!(cad.equalsIgnoreCase("bye"))){
            System.out.println("Hubo "+cv+" vocales, "+cc+" consonantes y otros "+cd+" caracteres\n");
            }
        }while(!(cad.equalsIgnoreCase("bye")));
    }
}