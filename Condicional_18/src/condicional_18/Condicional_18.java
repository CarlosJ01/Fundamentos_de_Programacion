package condicional_18;
import java.util.Scanner;
public class Condicional_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,num;
        String cat;
        String sig[] = {"Aries","Tauro","Geminis","Cancer","Leo","Virgo","Libra","Escorpio","sagitario","Capricornio","Acuario","Piscis"};
        System.out.println("Signos Zodiacales");
        for (i=0;i<12;i++)
            System.out.println((i+1)+")\t"+sig[i]);
        System.out.print("Dame un numero asociado a un signo Zodiacal: ");
        num=leer.nextInt();
        System.out.println("----------------------------------------------------");
        switch (num) {
            case 1:
            case 5:
            case 9: System.out.println("Su categoria es Fuego");
                break;
            case 2:
            case 6:
            case 10: System.out.println("Su categoria es Tierra");
                break;
            case 3:
            case 7:
            case 11: System.out.println("Su categoria es Aire");
                break;
            case 4:
            case 8:
            case 12: System.out.println("Su categoria es Agua");
                break;
            default:
                System.out.println("ERROR:\n<numero> no esta asociado a ningun numero");
        }
    }   
}