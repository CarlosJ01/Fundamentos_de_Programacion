package cadenas_13_ver2;
import java.util.Scanner;
public class Cadenas_13_Ver2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena/*="3/2+2/8"*/,result="",parcial="";
        int num1,num2,den1,den2,i,numr=0,denr=0,ent;
        char operador;
        System.out.print("Dame una cadena: ");
        cadena=leer.nextLine();
        for (i=0;cadena.charAt(i)!='/';i++) {
            parcial+=cadena.charAt(i);
        }
        num1=Integer.parseInt(parcial);
        //System.out.println("Primer Numerador: " + num1);
        for (i++,parcial="";cadena.charAt(i)!='+' && cadena.charAt(i)!='-' && cadena.charAt(i)!='*' && cadena.charAt(i)!='/';i++) {
            parcial+=cadena.charAt(i);
        }
        den1=Integer.parseInt(parcial);
        //System.out.println("Primer denominador: " + den1);
        operador=cadena.charAt(i);
        //System.out.println("La operacion es: " + operador);
        for (i++,parcial="";cadena.charAt(i)!='/';i++) {
            parcial+=cadena.charAt(i);
        }
        num2=Integer.parseInt(parcial);
        //System.out.println("Segundo Numerador: " + num2);
        for (i++,parcial="";i<cadena.length();i++) {
            parcial+=cadena.charAt(i);
        }
        den2=Integer.parseInt(parcial);
        //System.out.println("Segundo denominador: " + den2);
        switch (operador){
            case '+':   numr=den1*num2+den2*num1;
                        denr=den1*den2;
                break;
            case '-':   numr=den2*num1-den1*num2;
                        denr=den1*den2;
                break;  
            case '*':   numr=num1*num2;
                        denr=den1*den2;
                break;
            case '/':   numr=num1*den2;
                        denr=den1*num2;
                break;
        }
        //System.out.println("Resultado: "+numr+"/"+denr);
        ent=numr/denr;
        numr=numr%denr;
        for (i=numr;i>1;i--) {
            if (numr%i==0 && denr%i==0) {
                numr=numr/i;
                denr=denr/i;
            }
        }
        //System.out.println("Resultado simplificado: "+ent+" "+numr+"/"+denr);
        parcial=cadena+" = ";
        if (ent!=0) 
            parcial+=ent;
        if (numr!=0) 
            parcial+=numr+"/"+denr;
        System.out.println("Resultada: "+parcial);
    }   
}