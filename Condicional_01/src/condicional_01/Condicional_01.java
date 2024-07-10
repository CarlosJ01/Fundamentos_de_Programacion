package condicional_01;
import java.util.Scanner;
public class Condicional_01 {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        int edad,mon,Sem;
        float des=0f,monf;
        System.out.println("Dame tu edad: ");
        edad=leer.nextInt();
        System.out.println("Dame tu monto de inscripcion: ");
        mon=leer.nextInt();
        System.out.println("Dame tu semestre: ");
        Sem=leer.nextInt();
        System.out.println("");
        if(edad>=18 && Sem>=1 && Sem<=9){
           des=(float)((edad-18)*0.015);
           monf=mon-(mon*des);
           System.out.println("El descuento es de: " + (des*100)+" %");
           System.out.println("El monto Original es: " + mon+" $");
           System.out.println("El monto final es: " + monf +" $");
        }
        else{
           System.out.println("El descuento es de: " + (des*100)+" %");
           System.out.println("El monto Original es: " + mon+" $");
           System.out.println("El monto final es: " + mon +" $"); 
        }   
    }
}