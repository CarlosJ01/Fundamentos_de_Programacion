package condicional_19;
import java.util.Scanner;
public class Condicional_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int peso,hrsEje;
        float minEje,alt;
        String sex;
        System.out.print("Dame tu peso: ");
        peso=leer.nextInt();
        System.out.print("Dame tu altura: ");
        alt=leer.nextFloat();
        System.out.print("Dame tu sexo(M/F): ");
        leer.nextLine();
        sex=leer.nextLine();
        switch (sex.toUpperCase().charAt(0)) {
            case 'M':   if (alt>1.60 && peso>=55)
                            minEje=(float)((3*alt)*(peso*0.85));
                        else
                            minEje=(float)((2.5*alt)*(peso*0.70));
                break;
            case 'F':   if (alt>1.50 && peso>=70)
                            minEje=(float)((2*alt)*(peso*0.65));
                        else
                            minEje=(float)((2*alt)*(peso*0.55)); 
                break;
            default:
                System.out.println("-----------------------------------------------");
                System.out.println("Error");
                minEje=0;
        }
        if (minEje != 0) {
            hrsEje=(int)minEje/60;
            minEje=minEje-(hrsEje*60);
            System.out.println("-----------------------------------------------");
            System.out.println("El tiempo minimo para ejercitarce es de: "+hrsEje+" horas con: "+(int)minEje+" minutos Semanalmente" );
        }
    }  
}