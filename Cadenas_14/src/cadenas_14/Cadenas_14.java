package cadenas_14;
import java.util.Scanner;
public class Cadenas_14 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cad;
        char car;
        int nc,i,cp;
        boolean ind;
        do{
            System.out.println("NO INGRESAR NADA PARA SALIR");
            System.out.print("Dame una cadena: ");
            cad=leer.nextLine();
            cad=cad.trim();
            nc=cad.length();
            ind=false;
            if (!(cad.equalsIgnoreCase(""))){
                for (i=0,cp=0;i<nc;i++){
                    car=cad.charAt(i);
                    switch(car){
                        case ' ':   ind=true;
                            break;
                        default:    ind=false;
                            break;
                    }
                    if(ind==true && (cad.charAt(i-1))!=' '){
                        cp++;
                        ind=false;
                    }
                }
                if(ind==false && (cad.charAt(i-1)!=' ')){
                    cp++;
                }
                System.out.print("La palabra "+cad+" tiene: "+cp+" palabras\n\n");
            }
        }while (!(cad.equalsIgnoreCase("")));
    }
}