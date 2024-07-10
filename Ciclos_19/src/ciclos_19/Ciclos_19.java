package ciclos_19;
import java.util.Scanner;
public class Ciclos_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad;
        int nc,num,i=0;
        double numCua;
        char car;
        boolean ind=true;
        System.out.print("Dame una cadena: ");
        cad=leer.nextLine();
        nc=cad.length();
        while(i<nc && ind==true){
            car=cad.charAt(i);
            switch(car){
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    break;
                default: ind=false;
                    break;
            }
            i++;
        }
        if(ind==false){
            System.out.println("ERROR: La cadena no tiene formato de numero"); }
        else{
            num=Integer.parseInt(cad);
            num=num*num;
            System.out.println(cad+" al cuadrado es: "+num);
        } } }