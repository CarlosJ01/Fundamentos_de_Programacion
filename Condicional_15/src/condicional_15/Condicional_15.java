package condicional_15;
import java.util.Scanner;
public class Condicional_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int i,art,pro=0;
        for (i=0;i<12;i++) {
            System.out.print("Dame el numero de articulos producidos en "+mes[i]+": ");
            art=leer.nextInt();
            switch (i) {
                case 0:
                case 1:
                case 2: pro=pro+(art*15);
                    break;
                case 3:
                case 4:
                case 5: pro=pro+(art*17);
                    break;
                case 6:
                case 7: pro=pro+(art*19);
                    break;
                case 8:
                case 9:
                case 10:    pro=pro+(art*20);
                    break;
                case 11:    pro=pro+(art*21);
                    break;
            }
        }
        System.out.println("\nLA PRODUCTIVIDAD ANUAL ES: "+pro);
    }
}