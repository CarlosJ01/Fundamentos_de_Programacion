package condicional_21;
import java.util.Scanner;
public class Condicional_21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aPla,aRol;
        float malPla,malRol;
        double tot,des,pag,totRol,totPla,desRol = 0,desPla=0;
        System.out.print("Cuantos metros son de malla plana: ");
        malPla=leer.nextFloat();
        System.out.print("Cuantos años llevas comprando la malla plana: ");
        aPla=leer.nextInt();
        System.out.print("Cuantos metros son de malla de Rollo: ");
        malRol=leer.nextFloat();
        System.out.print("Cuantos años llevas comprando la malla de rollo: ");
        aRol=leer.nextInt();
        System.out.println("----------------------------------------------------");
        totRol=malRol*250;
        totPla=malPla*400;
        tot=totRol+totPla;
        if (aRol>5)
            desRol=totRol-(totRol*0.08);
        if (aPla>6)
            desPla=totPla-(totPla*0.06);
        des=desRol+desPla;
        pag=tot-des;
        System.out.println("El total es: "+tot+" $");
        System.out.println("El descuento es de: "+des+" $");
        System.out.println("El total a pagar es: "+pag+" $");
    }   
}