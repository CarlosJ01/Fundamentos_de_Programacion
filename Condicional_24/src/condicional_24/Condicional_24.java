package condicional_24;
import java.util.Scanner;
public class Condicional_24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num[] = new String[2];
        String ope,car="";
        int i,j;
        float res=0;
        boolean ind=true;
        System.out.println("Ingresa la Operacion Simple:");
        ope=leer.nextLine();
        System.out.println("____________________________________________________");
        for (i=0,j=0,num[j]="";i<ope.length();i++) {
            switch (ope.charAt(i)) {
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
                case '.':
                        num[j]+=ope.charAt(i);
                    break;
                default:
                    if (ope.charAt(i)=='+' || ope.charAt(i)=='-' || ope.charAt(i)=='/' || ope.charAt(i)=='*') {
                        car=String.valueOf(ope.charAt(i));
                        j++;
                        num[j]="";
                    }
                    else {
                        System.out.println("Error operador no aceptado");
                        ind=false;
                    }
            }
        }
        if (ind==true) {
            switch (car) {
                case "+":   res=Float.parseFloat(num[0])+Float.parseFloat(num[1]);
                    break;
                case "-":   res=Float.parseFloat(num[0])-Float.parseFloat(num[1]);
                    break;
                case "*":   res=Float.parseFloat(num[0])*Float.parseFloat(num[1]);
                    break;
                case "/":   res=Float.parseFloat(num[0])/Float.parseFloat(num[1]);
                    break;
            }
            System.out.println("El resultado de la operacion es: "+res);
        }
    } 
}